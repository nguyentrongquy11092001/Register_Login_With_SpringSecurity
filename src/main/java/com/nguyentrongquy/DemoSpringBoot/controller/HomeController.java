package com.nguyentrongquy.DemoSpringBoot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nguyentrongquy.DemoSpringBoot.model.Account;
import com.nguyentrongquy.DemoSpringBoot.model.Book;
import com.nguyentrongquy.DemoSpringBoot.service.AccountService;


@Controller
public class HomeController {
	@Autowired
	private AccountService accountService;
		
	public HomeController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	@GetMapping("/")
	public String index() {
		return "register";
	}
	@GetMapping("/signin")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@PostMapping("/createAccount")
	public String createAccount(@ModelAttribute Account account, HttpSession session) {
		 boolean existEmail = accountService.checkEmail(account.getEmail());
	        if (existEmail) {
				session.setAttribute("msg", "Email đã tồn tại! Vui lòng sử dụng email khác.");
				return "redirect:/register";
			}else {
				Account accountCreate =  accountService.createAccount(account);
		        if (accountCreate != null) {
		        	session.setAttribute("msgl", "Đăng ký thành công! Hãy đăng nhập tài khoản để tiếp tục.");
				}else {
					session.setAttribute("msg", "Đăng ký thất bại! Hệ thống lỗi, vui lòng thử lại sau.");
					return "redirect:/register";
				}
			}
	        return "redirect:/signin";
	}
}
