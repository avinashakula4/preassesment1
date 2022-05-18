package com.galvanize.tmo.paspringstarter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookService {
	
	private static List<Book>  allBooks= new ArrayList<>();
	
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
		if(allBooks!=null)
		{
		Collections.sort(allBooks, Comparator.comparing(Book::getTitle));
		}
		return allBooks;
	}

	public void removeAllBooks() {
		allBooks.clear();
		
	}

}