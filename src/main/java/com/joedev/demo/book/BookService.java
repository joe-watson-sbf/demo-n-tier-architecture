package com.joedev.demo.book;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
public class BookService {

    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Book addBook(Book book) {
        return bookDao.save(book);
    }

    public Book getBookById(Long id) {
        return bookDao.findById(id).orElseThrow(()-> new IllegalArgumentException(
                "Book with id " + id + " is not found!"));
    }

    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    public void deleteBook(Long id) {
        bookDao.deleteById(id);
    }

    // other methods
}
