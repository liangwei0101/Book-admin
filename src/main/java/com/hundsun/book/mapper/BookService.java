package com.hundsun.book.mapper;

import com.hundsun.book.model.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

/**
 * 图书服务
 */

@Mapper
public interface BookService {

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
