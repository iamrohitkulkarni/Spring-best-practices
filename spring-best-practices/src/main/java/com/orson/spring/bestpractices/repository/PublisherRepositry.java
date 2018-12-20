package com.orson.spring.bestpractices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orson.spring.bestpractices.model.Publisher;

public interface PublisherRepositry extends JpaRepository<Publisher, Long> {

}
