package com.example;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Author;
import com.example.entity.Book;
import com.example.repository.AddressRepository;
import com.example.repository.AuthorRepository;
import com.example.repository.StudentRepository;

//@Component
public class MainCommand implements CommandLineRunner{
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	AuthorRepository authorRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookOperation();
	}
	
	public void studentOperation(){

		/*List<Address> lstAddress = new ArrayList<Address>();
		
		lstAddress.add(new Address("4", "Pune"));
		lstAddress.add(new Address("5", "Bangalore"));
		
		addressRepository.saveAll(lstAddress);*/
		
		
		/*List<Student> lstStudent = new ArrayList<Student>();
		
		lstStudent.add(new Student("A", "R101", "ABC",new Address("4", "Pune")));
		lstStudent.add(new Student("B", "R101", "ABC",new Address("5", "Pune")));
		lstStudent.add(new Student("C", "R101", "ABC",new Address("5", "Bangalore")));
		
		System.out.println(studentRepository.saveAll(lstStudent));*/
		
		//System.out.println(studentRepository.findByRollno("R101"));
		
		//System.out.println(studentRepository.queryByName("A"));
		
		//System.out.println(studentRepository.getByNameAndUniversity("B","ABC"));
		
		//System.out.println(studentRepository.findStudentsUsingNativeQuery("A"));
		System.out.println(studentRepository.findByAddressCityAndAddressHouseNumber("Pune","5"));
	}

	
	public void bookOperation(){
		
		/*Set<Book> bkSet = new HashSet<Book>();
		bkSet.add(new Book("aks"));
		bkSet.add(new Book("bks"));
		
		Author author = new Author("test",bkSet);
		Book book = new Book();
		Book book2 = new Book();
		author.addBook(book);
		author.addBook(book2);*/
		
		
		Author author = new Author("test",new HashSet<Book>());
		Book book = new Book("aks");
		Book book2 = new Book("bks");
		author.addBook(book);
		author.addBook(book2);
		authorRepository.save(author);
		
		/*Author author = new Author();
		Book book = new Book();*/
		
		
		author = authorRepository.findById(Long.valueOf(1)).get();
		Set<Book> books = author.getBooks();
		
		//System.out.println(books);
		
		books.stream().forEach(b -> {
			System.out.println(b.getName() +" :: "+b.getAuthor().getName());
		});
		
	}
}
