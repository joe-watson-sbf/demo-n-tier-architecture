package com.joedev.demolibrary.book;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public class BookJpaDataService implements BookDao {

    private final BookRepository bookRepository;

    public BookJpaDataService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
