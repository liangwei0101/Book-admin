package com.hundsun.book.service.impl;

import com.hundsun.book.mapper.BookCommentMapper;
import com.hundsun.book.model.BookComment;
import com.hundsun.book.service.BookOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookOperationImpl implements BookOperationService {

    @Autowired
    private BookCommentMapper bookCommentMapper;

    @Override
    public List<BookComment> getBookCommentById(Integer no) {
        return bookCommentMapper.getBookCommentByNo(no);
    }

    @Override
    public List<BookComment> getBookCommentList() {
        return bookCommentMapper.getBookCommentList();
    }

    @Override
    public void addBookComment(BookComment bookComment) {
        bookCommentMapper.addBookComment(bookComment);
    }

    @Override
    public BookComment updateBookComment(BookComment book) {
        return bookCommentMapper.updateBookComment(book);
    }

    @Override
    public void deleteBookComment(String id) {
         bookCommentMapper.deleteBookComment(id);
    }
}
