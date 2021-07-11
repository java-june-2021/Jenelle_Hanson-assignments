package com.JenelleHanson.MVC.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.JenelleHanson.MVC.models.Book;
import com.JenelleHanson.MVC.services.BookService;

@Controller
public class BooksController {
	private final BookService bookService;
	public BooksController(BookService bookService) {
    this.bookService = bookService;
    }
	    
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "books/index.jsp";
    }
    
    @RequestMapping("/books/{id}")
    public String findBookById(Model model, @PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "showBook.jsp";
    }
    
    @RequestMapping("/books/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        if (book != null){
            model.addAttribute("book", book);
            return "editBook.jsp";
        }else{
            return "redirect:/books";
        }
    }
    
    @RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "/books/new.jsp";
    }
    
    @RequestMapping(value="/books", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "/books/new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
    
    @GetMapping("/books/edit/{id}")
    public String update(@ModelAttribute("book") Book book, @PathVariable("id") Long id, Model viewModel) {
    	Book thisBook = bookService.findBook(id);
    	viewModel.addAttribute("book", thisBook);
    	return "/books/edit.jsp";
    }
    

    @PostMapping("/books/edit/{id}")
    public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, @PathVariable("id") Long id) {
        if (result.hasErrors()) {
            return "edit.jsp";
        }else{
            bookService.updateBook(book);
            return "redirect:/books";
        }
    }
    
    //Note: You will notice that the POST and GET routes are the same for the same form 
    //- this is necessary for the errors to show and the user experience to be smooth. 
    //This is standard practice in the Java Springboot community.
       
    
    @RequestMapping(value="/books/delete/{id}")
    public String destroyBook(@PathVariable("id") Long id) {
        bookService.destroyBook(id);
        return "redirect:/books";
    }

//     @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
//     public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//         Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
//         return book;
//     }
//     
//     @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
//     public void destroy(@PathVariable("id") Long id) {
//         bookService.destroyBook(id);
//     }
 }
