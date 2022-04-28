package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
	
	
	@Column(name="name")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Author author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book )) return false;
        return id != null && id.equals(((Book) o).getId());
    }
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public Book(String name, Author author) {
		super();
		this.name = name;
		this.author = author;
	}
	
	public Book(String name ) {
		super();
		this.name = name;
	}
	
	public Book() {
		super();
	}
	
	
}
