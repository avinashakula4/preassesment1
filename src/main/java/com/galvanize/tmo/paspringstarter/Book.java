package com.galvanize.tmo.paspringstarter;


public class Book {
	
	
	int id;
	
	String author;
	String title;
	Long year;
	
	private static int count=1;
	
	public Book(String author, String title, Long year) {
		super();
		this.id = count++;
		this.author = author;
		this.title = title;
		this.year = year;
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
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}