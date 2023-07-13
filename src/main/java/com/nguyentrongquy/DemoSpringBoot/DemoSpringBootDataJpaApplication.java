package com.nguyentrongquy.DemoSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

import com.nguyentrongquy.DemoSpringBoot.model.Account;
import com.nguyentrongquy.DemoSpringBoot.model.Book;
import com.nguyentrongquy.DemoSpringBoot.repository.AccountRepository;
import com.nguyentrongquy.DemoSpringBoot.repository.BookRepository;

@SpringBootApplication(exclude = DataSourceTransactionManagerAutoConfiguration.class)
public class DemoSpringBootDataJpaApplication implements CommandLineRunner{
	@Autowired
	private AccountRepository accountRepository;
	
	public static void main(String[] args){
		SpringApplication.run(DemoSpringBootDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		List<Account> accounts = accountRepository.findAll();
		accounts.forEach(System.out :: println);
	}

}	
