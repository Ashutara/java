package com.library.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.library.entities.Book;
import com.library.entities.Student;

@Component
public interface BookService {
	public Book createBook (Book bId); // post
	public Book getBook(int bId);      // get
	public List<Book> getAllBooks();   // get
	public String delteBook (int bId); // delete
	public String updateBook(int bId, Book book); //put
	
	

}
