package com.hundsun.book.controller;

import com.hundsun.book.model.BookUser;
import com.hundsun.book.service.BookUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/borrowBook")
public class BookUserController {

    @Autowired
    private BookUserService bookUserService;

    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public BookUser add(Integer bookNo,String userNo, String beginDate, String endDate) throws ParseException {

        String aa = "112";
        bookUserService.AddBookUser(bookNo,userNo,beginDate,endDate);

        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BookUser getById(@PathVariable String id){
        return bookUserService.getBookUserById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public BookUser updateById(BookUser bookUser){
        return bookUserService.updateBookUserById(bookUser);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void getBookList(@PathVariable String id) {
        bookUserService.delBookUserById(id);
    }

}
