package com.hundsun.book.service.impl;

import com.hundsun.book.dto.BookCountDto;
import com.hundsun.book.mapper.BookOperationMapper;
import com.hundsun.book.model.Book;
import com.hundsun.book.model.BookOperation;
import com.hundsun.book.service.BookOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Dictionary;
import java.util.List;
import java.util.Map;

@Service
public class BookCommentImpl implements BookOperationService {

    @Autowired
    private BookOperationMapper bookCommentMapper;

    @Override
    public List<BookOperation> getBookCommentById(Integer no) {
        return bookCommentMapper.getBookCommentByNo(no);
    }

    @Override
    public List<BookOperation> getBookCommentList() {
        return bookCommentMapper.getBookCommentList();
    }

    @Override
    public void addBookComment(BookOperation bookComment) {
        bookCommentMapper.addBookComment(bookComment);
    }

    @Override
    public BookOperation updateBookComment(BookOperation book) {
        return bookCommentMapper.updateBookComment(book);
    }

    @Override
    public void deleteBookComment(String id) {
         bookCommentMapper.deleteBookComment(id);
    }
}
