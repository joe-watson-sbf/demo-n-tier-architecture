package com.joedev.demolibrary.book;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import java.util.*;

@Slf4j
@Repository("jpa")
public class BookFakeDataService implements BookDao{
    private final List<Book> bookList = new ArrayList<>();
    @Override
    public Book save(Book book) {
        Long id = new Date().getTime();
        book.setId(id);
        bookList.add(book);
        log.info("BOOK SAVED IN FAKE DATA");
        return book;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookList
                .stream()
                .filter(data -> data.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Book> findAll() {
        log.info("FETCH DATA IN FAKE DATA");
        return bookList;
    }

    @Override
    public void deleteById(Long id) {
        List<Book> newList = bookList
                .stream().filter(data -> !data.getId().equals(id))
                .toList();
        bookList.clear();
        bookList.addAll(newList);
    }
}
