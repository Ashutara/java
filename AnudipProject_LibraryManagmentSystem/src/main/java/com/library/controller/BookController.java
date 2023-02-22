package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.entities.Book;
import com.library.entities.Student;
import com.library.service.BookService;
import com.library.service.StudentService;
import com.library.serviceimpl.BookServiceImpl;
import com.library.serviceimpl.StudentServiceImpl;

@RestController
public class BookController {
	@Autowired(required = true)
	BookService bs = new BookServiceImpl();
	
	@PostMapping("/book")
	public ResponseEntity<Book> createStudent(@RequestBody Student st) {
		Book book = bs.createBook(book);
		if (book != null)
			return new ResponseEntity<Book>(book, HttpStatus.CREATED);

	}

	

}
