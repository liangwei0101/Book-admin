package com.hundsun.book.service.impl;

import com.hundsun.book.model.Book;
import com.hundsun.book.mapper.BookMapper;
import com.hundsun.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *图书实现
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public Book getBookById(String no) {
        //todo 业务逻辑
        Book bb = bookMapper.getBookById(no);
        return bb;
    }

    public List<Book> getBookList() {
        List<Book> aa = bookMapper.getBookList();
        return aa;
    }

    public void addBook(Book book) {
         bookMapper.addBook(book);
    }


    public void updateBook(String no, Book book) {
         bookMapper.updateBook(no,book);
    }

    public void deleteBook(String no) {
         bookMapper.deleteBook(no);
    }
}
