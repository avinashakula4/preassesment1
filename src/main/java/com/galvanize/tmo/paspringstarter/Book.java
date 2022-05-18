package com.galvanize.tmo.paspringstarter;


public class Book {
	
	
	int id;
	
	String author;
	String title;
	int yearPublished;
	
	
	private static int count=1;
	
	public Book(String author, String title, int yearPublished) {
		super();
		this.id = count++;
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}