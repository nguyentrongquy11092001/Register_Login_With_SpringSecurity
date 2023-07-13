package com.nguyentrongquy.DemoSpringBoot.service;

import java.util.List;
import java.util.Optional;

import com.nguyentrongquy.DemoSpringBoot.model.Account;

public interface AccountService {
	Account createAccount(Account account);

	List<Account> findAll();

	boolean checkEmail(String email);
}
