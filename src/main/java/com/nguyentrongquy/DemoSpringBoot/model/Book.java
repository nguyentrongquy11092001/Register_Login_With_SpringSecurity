package com.nguyentrongquy.DemoSpringBoot.model;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long bookId;
	@Column(nullable = false)
	private String bookTitle;
	private String author;
	private String publisher;
	private String ISBN;
	private int number_of_pages;
	private int quantity;
	private double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookTitle, String author, String publisher, String iSBN, int number_of_pages, int quantity,
			double price) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		this.publisher = publisher;
		ISBN = iSBN;
		this.number_of_pages = number_of_pages;
		this.quantity = quantity;
		this.price = price;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumber_of_pages() {
		return number_of_pages;
	}

	public void setNumber_of_pages(int number_of_pages) {
		this.number_of_pages = number_of_pages;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", publisher=" + publisher
				+ ", ISBN=" + ISBN + ", number_of_pages=" + number_of_pages + ", quantity=" + quantity + ", price="
				+ price + "]";
	}	
}
