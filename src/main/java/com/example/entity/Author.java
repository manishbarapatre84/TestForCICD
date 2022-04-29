package com.example.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	//@OneToMany(mappedBy="author", cascade= CascadeType.ALL, orphanRemoval=true)
	@OneToMany(cascade= CascadeType.ALL, orphanRemoval=true)
	private Set<Book> books;
	
	public Author(){
		super();
	}
	public Author(String name ){
		super();
		this.name=name;
	}
	
	public Author(String name,Set<Book> books){
		super();
		this.name=name;
		this.books=books;
		
		for (Book book : books) {
			book.setAuthor(this);
		}
	}

	public void addBook(Book book){
        books.add(book);
        book.setAuthor(this);
    }
    public void removeBook(Book book){
        books.remove(book);
        book.setAuthor(null);
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", books=" + books + "]";
	}
	
    
    

}
