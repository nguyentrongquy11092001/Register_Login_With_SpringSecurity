package com.nguyentrongquy.DemoSpringBoot.service;

import java.util.List;
import java.util.Optional;

import com.nguyentrongquy.DemoSpringBoot.model.Book;

public interface BookService {
	List<Book> findAll();
	void saveBook(Book book);
	Optional<Book> findBookById(long id);
	void deleteBook(Book book);
}
