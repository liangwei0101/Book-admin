package com.hundsun.book.service;

import com.hundsun.book.dto.BookCountDto;
import com.hundsun.book.model.Book;

import java.util.List;

/**
 * 图书服务接口
 */

public interface BookService {

    Book getBookById(String no);

    List<Book> getBookList();

    void addBook(Book book);

    Book updateBook(Book book);

    void deleteBook(String no);

    public BookCountDto getBookCountList();
}
