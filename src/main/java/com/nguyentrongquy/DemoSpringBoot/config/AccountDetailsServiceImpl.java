package com.nguyentrongquy.DemoSpringBoot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nguyentrongquy.DemoSpringBoot.model.Account;
import com.nguyentrongquy.DemoSpringBoot.repository.AccountRepository;
@Service
public class AccountDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private AccountRepository accountRepository;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Account account = accountRepository.findByEmail(email);
		if (account != null) {
			return new CustomAccountDetails(account);
		}
		throw new UsernameNotFoundException("user not available");
	}

}
