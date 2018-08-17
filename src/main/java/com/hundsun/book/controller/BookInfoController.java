package com.hundsun.book.controller;


import com.hundsun.book.model.Book;
import com.hundsun.book.mapper.BookMapper;
import com.hundsun.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 图书信息控制器
 */

@RestController
public class BookInfoController {

    @Autowired
    private BookService bookService;
    /**
     * 获取图书信息
     */
    @RequestMapping(value = "/book",method = RequestMethod.GET)
    public List<Book> getBookInfo() {
        var aa = bookService.getBookList();
        return aa;
    }


//    private BookMapper bookService;
//
//    @RequestMapping(value = "/{no}", method = RequestMethod.GET)
//    public Book getBookById(@RequestParam("no") String no){
//        return bookService.getBookById(no);
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public List<Book> getBookList() {
//        return bookService.getBookList();
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public Book addBook(@RequestParam("no") String no, @RequestParam("name") String name) {
//        Book book = new Book();
//        return book;
//    }
}
