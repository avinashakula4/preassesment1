package com.galvanize.tmo.paspringstarter;


import java.util.List;

public class Books {
	
	
	public Books(List<Book> books) {
		super();
		this.books = books;
	}

	List<Book>  books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	
}