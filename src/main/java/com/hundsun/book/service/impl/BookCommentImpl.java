package com.hundsun.book.service.impl;

import com.hundsun.book.mapper.BookCommentMapper;
import com.hundsun.book.model.BookComment;
import com.hundsun.book.service.BookCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BookCommentImpl implements BookCommentService {

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
        Date date = new Date(); //获取当前的系统时间。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dt = sdf.format(date);
        bookComment.setCommentTime(dt);
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
