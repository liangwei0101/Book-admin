package com.hundsun.book.controller;

import com.hundsun.book.service.BookMapper;
import com.hundsun.book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 图书信息控制器
 */

@RestController
public class BookInfoController {

    @Autowired
    private BookMapper bookMapper;
    /**
     * 获取图书信息
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Book> getBookInfo() {
        var aa = bookMapper.getBookList();
        return aa;
    }
}
