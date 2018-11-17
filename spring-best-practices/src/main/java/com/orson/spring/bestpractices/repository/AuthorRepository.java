package com.orson.spring.bestpractices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orson.spring.bestpractices.model.Author;

/**
 * @author Rohit Kulkarni.
 * 17-Nov-2018
 * spring-best-practices
 *
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
