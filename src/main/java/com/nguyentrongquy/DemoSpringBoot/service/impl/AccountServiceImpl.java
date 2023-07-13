package com.nguyentrongquy.DemoSpringBoot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nguyentrongquy.DemoSpringBoot.model.Account;
import com.nguyentrongquy.DemoSpringBoot.repository.AccountRepository;
import com.nguyentrongquy.DemoSpringBoot.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public Account createAccount(Account account) {
		account.setPassword(passwordEncoder.encode(account.getPassword()));
		account.setRole("ROLE_USER");
		return accountRepository.save(account);
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return accountRepository.existsByEmail(email);
	}
}
