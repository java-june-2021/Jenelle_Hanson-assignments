package com.JenelleHanson.MVC.services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.JenelleHanson.MVC.models.Book;
import com.JenelleHanson.MVC.repositories.BookRepository;
@Service
public class BookService {
	// adding the book repository as a dependency
	   private BookRepository bookRepository;
	    
	    public BookService(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }
	    
	    // returns all the books
	    public List<Book> allBooks() {
	        return bookRepository.findAll();
	    }
	    
	    // creates a book
	    public Book createBook(Book b) {
	        return bookRepository.save(b);
	    }
	    // retrieves a book
	    public Book findBook(Long id) {
	        Optional<Book> optionalBook = bookRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	        //public Event getEventById(Long id) {
	        //return this.eRepo.findById(id).orElse(null);
	        //} same thing to as method it is inside
	    }
	    
	    //edits a book
	    public Book updateBook(Book b) {
	    	return bookRepository.save(b);
	    }
	    
	    //destroys a book
	    public void destroyBook(Long id) {
	    	bookRepository.deleteById(id);
	    }
	    
}
