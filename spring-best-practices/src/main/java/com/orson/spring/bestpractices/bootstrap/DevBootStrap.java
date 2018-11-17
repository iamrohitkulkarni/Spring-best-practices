package com.orson.spring.bestpractices.bootstrap;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.orson.spring.bestpractices.model.Author;
import com.orson.spring.bestpractices.model.Book;
import com.orson.spring.bestpractices.repository.AuthorRepository;
import com.orson.spring.bestpractices.repository.BookRepository;
 @Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
   AuthorRepository authorRepository;
   BookRepository bookRepository;
   
	public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository) {
	super();
	this.authorRepository = authorRepository;
	this.bookRepository = bookRepository;
}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}
  public void initData() {
	  //Adding Authors < AAAA & CCCC to h2 Database > at the Bootstrap
	  Author AAAA=new Author("AAAA","BBBB");
	  Book jba=new Book("java by AAAA","1234","orson");
	  AAAA.getBooks().add(jba);
	  jba.getAuthors().add(AAAA);
	  authorRepository.save(AAAA);
	  bookRepository.save(jba);
	  
	  
	  Author CCCC=new Author("CCCC","DDDD");
	  Book jbc=new Book("java by CCCC","1234","orson");
	  CCCC.getBooks().add(jbc);
	 jbc.getAuthors().add(CCCC);
	  authorRepository.save(CCCC);
	  bookRepository.save(jbc);
  }
}
