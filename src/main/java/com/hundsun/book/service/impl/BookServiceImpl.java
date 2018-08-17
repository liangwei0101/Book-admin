package com.hundsun.book.service.impl;

import com.hundsun.book.model.Book;
import com.hundsun.book.service.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *图书实现
 */
@Service
public class BookServiceImpl implements BookMapper {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book getBookById(String no) {
        return bookMapper.getBookById(no);
    }

    @Override
    public List<Book> getBookList() {
        List<Book> aa = bookMapper.getBookList();
        return aa;
    }

    @Override
    public void addBook(Book book) {
         bookMapper.addBook(book);
    }

    @Override
    public void updateBook(String no, Book book) {
         bookMapper.updateBook(no,book);
    }

    @Override
    public void deleteBook(String no) {
         bookMapper.deleteBook(no);
    }
}
