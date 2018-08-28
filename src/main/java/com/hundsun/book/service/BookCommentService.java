package com.hundsun.book.service;

import com.hundsun.book.model.BookComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookCommentService {

    List<BookComment> getBookCommentById(@Param("no") Integer no);

    List<BookComment> getBookCommentList();

    void addBookComment(BookComment bookComment);

    BookComment updateBookComment(BookComment book);

    void deleteBookComment(@Param("comment_id") String comment_id);

}
