package com.nguyentrongquy.DemoSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nguyentrongquy.DemoSpringBoot.model.Book;
import com.nguyentrongquy.DemoSpringBoot.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	
	@GetMapping({"","/listBook"})
	public ModelAndView findAllBooks() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("books", bookService.findAll());
		modelAndView.setViewName("listBook");
        return modelAndView;
	}
	@PostMapping("/saveBook")
    public ModelAndView saveBook(@ModelAttribute Book book) {
        ModelAndView modelAndView = new ModelAndView();
        bookService.saveBook(book);
        modelAndView.setViewName("redirect:/books");
        return modelAndView;
    }
	@GetMapping("/showAddForm")
    public ModelAndView showAddForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("book", new Book());
        modelAndView.setViewName("addBook");
        return modelAndView;
    }
	@GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam long id) {
        ModelAndView modelAndView = new ModelAndView();
        Book book = bookService.findBookById(id).get();
        modelAndView.addObject("book", book);
        modelAndView.setViewName("addBook");
        return modelAndView;
    }

    @GetMapping("/deleteBook")
    public ModelAndView deleteBook(long id) {
        ModelAndView model = new ModelAndView();
        Book book = bookService.findBookById(id).get();
        bookService.deleteBook(book);
        model.setViewName("redirect:/books");
        return model;
    }
}
