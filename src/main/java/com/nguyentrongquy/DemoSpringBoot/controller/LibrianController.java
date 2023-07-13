package com.nguyentrongquy.DemoSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nguyentrongquy.DemoSpringBoot.service.BookService;

@Controller
@RequestMapping("/librian")
public class LibrianController {
	@Autowired
	private BookService bookService;

	public LibrianController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@GetMapping({"/","/listBook"})
	public ModelAndView findAllBooks() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("books", bookService.findAll());
		modelAndView.setViewName("librian/homeLibrian");
        return modelAndView;
	}
}