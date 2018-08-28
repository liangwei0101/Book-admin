package com.hundsun.book.service;

import com.hundsun.book.model.BookOperation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookOperationService {

    List<BookOperation> getBookCommentById(@Param("no") Integer no);

    List<BookOperation> getBookCommentList();

    void addBookComment(BookOperation bookComment);

    BookOperation updateBookComment(BookOperation book);

    void deleteBookComment(@Param("comment_id") String comment_id);

}
