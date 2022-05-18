package com.galvanize.tmo.paspringstarter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookService {
	
	private  List<Book>  allBooks= new ArrayList<>();
	
	 Book b1= new Book("alen","world history",1980);
	
	 Book b2= new Book("ben","adventure",1980);
	 Book b3= new Book("cathy","fly sky",1980);
	
	
	
	{
		allBooks.add(b1);
		allBooks.add(b2);
		allBooks.add(b3);
	}
	
	public  Book add(Book b)
	{
		if(b.author!=null)
		{
		allBooks.add(b);
		}
		return b;
		
	}
	
	public List<Book> retrieveAllBooks()
	{
		// if(allBooks!=null)
		// {
		// Collections.sort(allBooks, Comparator.comparing(Book::getTitle));
		// }
		return allBooks;
	}

	public void removeAllBooks() {
		allBooks.clear();
		Book.count=1;

		
	}

}