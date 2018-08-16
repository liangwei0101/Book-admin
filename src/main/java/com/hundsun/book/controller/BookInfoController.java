package com.hundsun.book.controller;

import com.hundsun.book.model.Book;
import com.hundsun.book.serviceImpl.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 图书信息控制器
 */

@RestController
public class BookInfoController {

    BookServiceImpl bookServiceImpl = new BookServiceImpl();
    /**
     * 获取图书信息
     */
    @RequestMapping("/")
    @ResponseBody
    public void getBookInfo() {
        List<Book> aa = bookServiceImpl.getBookList();
    }
}
