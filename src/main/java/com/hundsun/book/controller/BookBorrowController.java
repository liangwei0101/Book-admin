package com.hundsun.book.controller;

import com.hundsun.book.model.BookBorrow;
import com.hundsun.book.service.BookBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/borrowBook")
public class BookBorrowController {

    @Autowired
    private BookBorrowService bookUserService;

    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public Integer add(Integer bookNo, String userNo, String beginDate, String endDate) throws ParseException {
        Integer temp = bookUserService.AddBookBorrow(bookNo,userNo,beginDate,endDate);
        return temp;
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public List<Map> getById(@PathVariable String userId){
        return bookUserService.getBookUserById(userId);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public BookBorrow updateById(BookBorrow bookBorrow){
        return bookUserService.updateBookUserById(bookBorrow);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void getBookList(@PathVariable String id) {
        bookUserService.delBookUserById(id);
    }

}
