package com.hundsun.book.Service;

import com.hundsun.book.model.Book;

import java.util.List;

/**
 * 图书服务
 */
public interface BookService {

    Book getBookById(String no);

    List<Book> getBookList();

    int addBook(Book book);

    int updateBook(String no, Book book);

    int deleteBook(String no);
}
