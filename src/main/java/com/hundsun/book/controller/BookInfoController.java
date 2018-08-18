package com.hundsun.book.controller;


import com.hundsun.book.model.Book;
import com.hundsun.book.mapper.BookMapper;
import com.hundsun.book.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 图书信息控制器
 */

@RestController
@RequestMapping("/book")
@Api(value = "PageController", description = "获取图书API")
public class BookInfoController {

    @Autowired
    private BookService bookService;
    /**
     * 获取图书信息
     */

    @ApiOperation(value="查询图书列表", notes="获取全部的图书列表")
    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBookInfo() {
        List<Book> aa=  bookService.getBookList();
        return bookService.getBookList();
    }

    @ApiOperation(value="查询图书具体信息", notes="根据url的no来获取图书详细信息")
    @ApiImplicitParam(name = "no", value = "图书编号", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/{no}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable String no){
        return bookService.getBookById(no);
    }
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
