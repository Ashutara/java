package com.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
