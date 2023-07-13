package com.nguyentrongquy.DemoSpringBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountId;
	@Column(nullable = false)
	private String fullName;
	private String address;
	private String phoneNumber;
	private String email;
	private String password;
	private String role;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String fullName, String address, String phoneNumber, String email, String password, String role) {
		super();
		this.fullName = fullName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", fullName=" + fullName + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}

	
}