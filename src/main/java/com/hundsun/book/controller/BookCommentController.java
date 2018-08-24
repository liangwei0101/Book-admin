package com.hundsun.book.controller;

import com.hundsun.book.model.BookComment;
import com.hundsun.book.service.BookCommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookComment")
@Api(value = "BookCommentController", description = "获取图书评论API")
public class BookCommentController {

    @Autowired
    private BookCommentService bookCommentService;

    @ApiOperation(value="增加图书评论", notes="增加图书评论")
    @ApiImplicitParam(name = "bookComment", value = "图书评论详细实体", required = true, dataType = "bookComment")
    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public BookComment addBook(BookComment bookComment) {
        bookCommentService.addBookComment(bookComment);
        return bookComment;
    }

    @ApiOperation(value="查询图书评论列表", notes="获取的图书评论全部列表")
    @RequestMapping(method = RequestMethod.GET)
    public List<BookComment> getBookInfo() {
        List<BookComment> aa  = bookCommentService.getBookCommentList();
        System.out.println(""+aa);
        return bookCommentService.getBookCommentList();
    }
}
