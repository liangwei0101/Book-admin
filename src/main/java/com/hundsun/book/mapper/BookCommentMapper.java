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

    @Select("select * from book_comment a where a.book_no=#{no}")
    List<BookComment> getBookCommentByNo(@Param("no") Integer no);

    @Select("select * from book_comment")
    List<BookComment> getBookCommentList();

    @Insert({"insert into book_comment(user_id, comment_time, comment_id, comment_content, book_no, book_score) values(#{userId}, #{commentTime}, #{commentId}, #{commentContent}, #{bookNo}, #{bookScore})"})
    void addBookComment(BookComment bookComment);

    @Select("select * from book_comment")
    BookComment updateBookComment(BookComment book);

    @Delete("delect from book_comment where no=#{no}")
    void deleteBookComment(@Param("comment_id") String comment_id);
}
