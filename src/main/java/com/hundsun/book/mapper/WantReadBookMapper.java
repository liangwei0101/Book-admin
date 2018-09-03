package com.hundsun.book.mapper;

import com.hundsun.book.model.WantReadBook;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WantReadBookMapper {

    @Select("select * from want_read_book a where a.user_id=#{userId}")
    List<WantReadBook> getByUserId(@Param("userId") String userId);

    @Select("select * from want_read_book a where a.book_name like '%'||#{bookName}||'%'")
    List<WantReadBook> getByUserName(@Param("bookName") String bookName);

    @Select("select * from want_read_book")
    List<WantReadBook> getAllList();

    @Insert({"insert into want_read_book(book_no, book_name, create_time, reason, user_id,thumbs_count) values(#{bookNo}, #{bookName}, #{createTime}, #{reason}, #{userId},#{thumbsCount})"})
    void add(WantReadBook bookComment);

    @Select("select * from want_read_book")
    WantReadBook update(WantReadBook book);

    @Delete("delect from want_read_book where no=#{no}")
    void delete(@Param("no") Integer no);
}
