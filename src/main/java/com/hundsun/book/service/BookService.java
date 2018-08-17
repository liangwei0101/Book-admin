package com.hundsun.book.service;

import com.hundsun.book.model.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 图书服务接口
 */

public interface BookService {

    Book getBookById(String no);

    List<Book> getBookList();

    void addBook(Book book);

    void updateBook(String no, Book book);

    void deleteBook(String no);
}
