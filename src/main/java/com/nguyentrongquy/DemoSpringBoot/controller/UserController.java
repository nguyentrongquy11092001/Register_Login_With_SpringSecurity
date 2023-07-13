package com.nguyentrongquy.DemoSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nguyentrongquy.DemoSpringBoot.model.Account;
import com.nguyentrongquy.DemoSpringBoot.service.AccountService;
import com.nguyentrongquy.DemoSpringBoot.service.BookService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private BookService bookService;

	public UserController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
//	@GetMapping("/")
//	public String home() {
//		return "user/homeUser";
//	}
//	
	@GetMapping({"/","/listBook"})
	public ModelAndView findAllBooks() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("books", bookService.findAll());
		modelAndView.setViewName("user/homeUser");
        return modelAndView;
	}
}
