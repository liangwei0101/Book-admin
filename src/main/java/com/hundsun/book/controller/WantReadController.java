package com.hundsun.book.controller;

import com.hundsun.book.model.WantReadBook;
import com.hundsun.book.service.WantReadBookService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/wantRead")
public class WantReadController {

    @Autowired
    private WantReadBookService wantReadBookService;

    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public WantReadBook add(WantReadBook wantReadBook) throws ParseException {
        wantReadBook.setCreateTime(new Date());
        wantReadBook.setThumbsCount(0);
        wantReadBookService.add(wantReadBook);
        return null;
    }

    @RequestMapping(value = "/byUserId/{userId}", method = RequestMethod.GET)
    public List<WantReadBook> getById(@PathVariable String userId){
        return wantReadBookService.getByUserId(userId);
    }

    @RequestMapping(value = "/byName/{bookName}", method = RequestMethod.GET)
    public List<WantReadBook> getByName(@PathVariable String bookName){
        return wantReadBookService.getByUserName(bookName);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public WantReadBook updateById(WantReadBook wantReadBook){
        return wantReadBookService.update(wantReadBook);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void getBookList(@PathVariable Integer no) {
        wantReadBookService.delete(no);
    }

}
