package com.hundsun.book.dto;

import com.hundsun.book.model.Book;

import java.util.List;

/**
 * 书本统计传输对象
 */
public class BookCountDto {

    /**
     * 最想看的图书列表
     */
    public List<Book> wantReadBookList;

    /**
     * 喜欢图书列表
     */
    public List<Book> loveBookList;

    /**
     * 评分图书列表
     */
    public List<Book> scoreBookList;

    /**
     * 喜欢图书列表
     */
    public List<Book> mostCommentList;
}
