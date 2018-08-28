package com.hundsun.book.mapper;

import com.hundsun.book.model.BookOperation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 图书评论
 */
public interface BookOperationMapper {

    @Select("select * from user_book_operation a where a.book_no=#{no}")
    List<BookOperation> getBookCommentByNo(@Param("no") Integer no);

    @Select("select * from user_book_operation")
    List<BookOperation> getBookCommentList();

    @Insert({"insert into user_book_operation(comment_id, comment_content, book_no, comment_love_count, book_score) values(#{commentId}, #{commentContent}, #{bookNo}, #{commentLoveCount}, #{bookScore})"})
    void addBookComment(BookOperation bookComment);

    @Select("select * from user_book_operation")
    BookOperation updateBookComment(BookOperation book);

    @Delete("delect from user_book_operation where no=#{no}")
    void deleteBookComment(@Param("comment_id") String comment_id);
}
