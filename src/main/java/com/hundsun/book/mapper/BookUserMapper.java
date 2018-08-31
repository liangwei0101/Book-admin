package com.hundsun.book.mapper;

import com.hundsun.book.model.Book;
import com.hundsun.book.model.BookUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BookUserMapper {

    @Insert({"insert into book_user(user_id, book_id, book_status, begin_date, end_date) values(#{userId}, #{bookId}, #{bookStatus}, #{BeginDate}, #{EndDate})"})
    void AddBookUser(BookUser bookUser);

    @Delete("delect from book_user where id=#{id}")
    BookUser delBookUserById(@Param("id") String id);

    BookUser updateBookUserById(BookUser bookUser);

    @Select("select * from book_user where id = #{no}")
    BookUser getBookUserById(@Param("id") String id);
}
