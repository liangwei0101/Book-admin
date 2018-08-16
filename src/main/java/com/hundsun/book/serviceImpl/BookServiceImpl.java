package com.hundsun.book.serviceImpl;

import com.hundsun.book.model.Book;
import com.hundsun.book.mapper.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *图书实现
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookService bookService;

    @Override
    public Book getBookById(String no) {
        return bookService.getBookById(no);
    }

    @Override
    public List<Book> getBookList() {
        return bookService.getBookList();
    }

    @Override
    public void addBook(Book book) {
         bookService.addBook(book);
    }

    @Override
    public void updateBook(String no, Book book) {
         bookService.updateBook(no,book);
    }

    @Override
    public void deleteBook(String no) {
         bookService.deleteBook(no);
    }
}
