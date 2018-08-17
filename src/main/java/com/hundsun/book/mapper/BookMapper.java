package com.hundsun.book.mapper;

import com.hundsun.book.model.Book;
import org.apache.ibatis.annotations.*;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 图书服务接口
 */
public interface BookMapper {

    @Select("select * from BookInfo where no = #{no}")
    Book getBookById(@Param("no") String no);

    @Select("select * from BookInfo")
    List<Book> getBookList();

    @Insert("insert into BookInfo(no, name, score, love_count, collection_count, comments_count) values(#{no}, #{name}, #{score}, #{love_count}, #{collection_count}, #{comments_count}")
    void addBook(Book book);

    void updateBook(String no, Book book);

    @Delete("delect from BookInfo where no=#{no}")
    void deleteBook(@Param("no") String no);
}
