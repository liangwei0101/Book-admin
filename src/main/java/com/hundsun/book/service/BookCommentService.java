package com.hundsun.book.service;

import com.hundsun.book.model.BookComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookCommentService {

    BookComment getBookCommentById(@Param("no") String no);

    List<BookComment> getBookCommentList();

    void addBookComment(BookComment bookComment);

    BookComment updateBookComment(BookComment book);

    void deleteBookComment(@Param("comment_id") String comment_id);

}
