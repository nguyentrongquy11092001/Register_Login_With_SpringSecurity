package com.nguyentrongquy.DemoSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nguyentrongquy.DemoSpringBoot.model.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	public boolean existsByEmail(String email);
	public Account findByEmail(String email);
}
