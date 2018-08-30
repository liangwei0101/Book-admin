package com.hundsun.book.service;

import com.hundsun.book.dto.BookCountDto;
import com.hundsun.book.model.Book;
import com.hundsun.book.model.BookOperation;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 图书服务接口
 */

public interface BookService {

    Book getBookById(String no);

    Book getBookByNo(Integer no);

    List<Book> getBookList();

    void addBook(Book book);

    Book updateBook(Book book);

    void deleteBook(String no);

    public List<Map> getBookCountList();
}
