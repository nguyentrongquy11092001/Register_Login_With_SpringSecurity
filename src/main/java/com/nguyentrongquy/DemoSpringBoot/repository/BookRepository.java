package com.nguyentrongquy.DemoSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nguyentrongquy.DemoSpringBoot.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
