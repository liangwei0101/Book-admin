package com.hundsun.book.mapper;

import com.hundsun.book.model.Book;
import org.apache.ibatis.annotations.*;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 图书服务接口
 */
public interface BookMapper {

    @Select("select * from book_info where no = #{no}")
    Book getBookById(@Param("no") String no);

    @Select("select * from book_info")
    List<Book> getBookList();

    @Insert({"insert into book_info(no, name, author, status, introduce, url}) values(#{no}, #{name}, #{author}, #{status}, #{introduce}, #{url}"})
    void addBook(Book book);

    @Select("select * from book_info")
    Book updateBook(Book book);

    @Delete("delect from book_info where no=#{no}")
    void deleteBook(@Param("no") String no);
}