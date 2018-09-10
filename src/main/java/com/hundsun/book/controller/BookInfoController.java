package com.hundsun.book.controller;


import com.hundsun.book.dto.BookCountDto;
import com.hundsun.book.model.Book;
import com.hundsun.book.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 图书信息控制器
 */

@RestController
@RequestMapping("/book")
@Api(value = "BookController", description = "获取图书API")
public class BookInfoController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value ="/home", method = RequestMethod.GET)
    public List<Map> getIndexList(){
        return bookService.getBookIndex();
    }

    @ApiOperation(value="创建图书", notes="创建图书")
    @ApiImplicitParam(name = "book", value = "图书详细实体", required = true, dataType = "Book")
    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public Book addBook(Book book) {
        bookService.addBook(book);
        return book;
    }

    @ApiOperation(value="查询图书列表", notes="获取全部的图书列表")
    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBookInfo() {
        return  bookService.getBookList();
    }

    @ApiOperation(value="查询图书具体信息", notes="根据url的no来获取图书详细信息")
    @ApiImplicitParam(name = "no", value = "图书编号", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/{no}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable Integer no){
        return bookService.getBookByNo(no);
    }

    @ApiOperation(value="更新图书具体信息", notes="根据url的no来更新图书")
    @ApiImplicitParam(name = "book", value = "图书编号", required = true, dataType = "Book")
    @RequestMapping(method = RequestMethod.PUT)
    public Book updateBookById(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @ApiOperation(value="删除图书", notes="根据no来删除图书详细信息")
    @ApiImplicitParam(name = "book", value = "图书编号", required = true, dataType = "Book")
    @RequestMapping(method = RequestMethod.DELETE)
    public void getBookList(@PathVariable String no) {
         bookService.deleteBook(no);
    }

    @ApiOperation(value="查询图书统计信息", notes="获取图书统计详细信息")
    @RequestMapping(value ="/count",method = RequestMethod.GET)
    public List<Map> getBookAndCommentList(){
        return bookService.getBookCountList();
    }
}
