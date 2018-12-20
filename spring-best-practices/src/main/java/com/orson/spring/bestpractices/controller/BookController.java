package com.orson.spring.bestpractices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orson.spring.bestpractices.repository.BookRepository;

/**
 * @author Rohit Kulkarni.
 * 30-Nov-2018
 * spring-best-practices
 *
 */
@Controller
public class BookController {
	private BookRepository bookRepository;

	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
    @RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("Books",bookRepository.findAll());
		System.out.println("hello");
		return "Books";
		
	}
}
