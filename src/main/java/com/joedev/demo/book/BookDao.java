package com.joedev.demo.book;

import java.util.List;
import java.util.Optional;


public interface BookDao {
    Book save(Book book);
    Optional<Book> findById(Long id);
    List<Book> findAll();
    void deleteById(Long id);
}
