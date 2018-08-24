package com.hundsun.book.mapper;

import com.hundsun.book.model.BookComment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 图书评论
 */
public interface BookCommentMapper {

    @Select("select * from book_comment where no = #{no}")
    BookComment getBookCommentById(@Param("no") String no);

    @Select("select * from book_comment")
    List<BookComment> getBookCommentList();

    @Insert({"insert into book_comment(comment_id, comment_content, book_no, comment_love_count, book_socre}) values(#{comment_id}, #{comment_content}, #{book_no}, #{comment_love_count}, #{book_socre}"})
    void addBookComment(BookComment bookComment);

    @Select("select * from book_info")
    BookComment updateBookComment(BookComment book);

    @Delete("delect from book_info where no=#{no}")
    void deleteBookComment(@Param("comment_id") String comment_id);
}
