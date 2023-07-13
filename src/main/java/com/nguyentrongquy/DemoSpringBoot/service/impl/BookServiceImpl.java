package com.nguyentrongquy.DemoSpringBoot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyentrongquy.DemoSpringBoot.model.Book;
import com.nguyentrongquy.DemoSpringBoot.repository.BookRepository;
import com.nguyentrongquy.DemoSpringBoot.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
	}

	@Override
	public Optional<Book> findBookById(long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.delete(book);
	}

}
