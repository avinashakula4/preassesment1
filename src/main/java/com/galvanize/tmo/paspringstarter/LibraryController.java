package com.galvanize.tmo.paspringstarter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LibraryController {
	
	@Autowired
	private BookService service;
	
	@PostMapping("/api/books")
	@ResponseStatus(HttpStatus.CREATED)
	public Book addBook(@RequestBody Book newBook)
	{
		Book book=service.add(newBook);
		return book;
	}
	
	@GetMapping("/api/books")
	public List<Book> retrieveAllBooks()
	{
	Books books =new Books(null);
				
	books.setBooks(service.retrieveAllBooks());
		 return books;
	}

	
	@DeleteMapping("/api/books")
	@ResponseStatus(HttpStatus.NO_CONTENT)
		public void removeAllBooks()
		{
			service.removeAllBooks();
		}
	
}