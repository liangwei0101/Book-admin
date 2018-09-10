package com.hundsun.book.mapper;

import com.hundsun.book.model.BookBorrow;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookBorrowMapper {

    @Insert({"insert into book_borrow(user_id, book_id, status, begin_date, end_date) values(#{userId}, #{bookId}, #{status}, #{beginDate}, #{endDate})"})
    void add(BookBorrow bookBorrow);

    @Delete("delect from book_borrow where id=#{id}")
    BookBorrow del(@Param("id") String id);

    BookBorrow update(BookBorrow bookBorrow);

    @Select("select * from book_borrow where book_id = #{bookId}")
    BookBorrow getById(String bookId);

    @Select("select * from book_borrow where user_id = #{userId}")
    List<BookBorrow> getByUserId(String userId);
}
