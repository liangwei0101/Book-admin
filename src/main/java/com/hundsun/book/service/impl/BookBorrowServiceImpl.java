package com.hundsun.book.service.impl;

import com.hundsun.book.mapper.BookBorrowMapper;
import com.hundsun.book.model.Book;
import com.hundsun.book.model.BookBorrow;
import com.hundsun.book.service.BookBorrowService;
import com.hundsun.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static com.hundsun.book.util.util.getDaySub;

@Service
public class BookBorrowServiceImpl implements BookBorrowService {

    @Autowired
    private BookBorrowMapper bookBorrowMapper;

    @Autowired
    private BookService bookService;

    @Override
    public Integer AddBookBorrow(Integer bookNo, String userId, String beginDate, String endDate) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        Book book  =  bookService.getBookByNo(bookNo);
        BookBorrow bookBorrow = bookBorrowMapper.getById(book.getId());

        if(bookBorrow != null){
            return -1;
        }else{
            bookBorrow = new BookBorrow();
            bookBorrow.setBookId(book.getId());
            bookBorrow.setUserId(userId);
            bookBorrow.setStatus("1");
            bookBorrow.setBeginDate(df.parse(beginDate));
            bookBorrow.setEndDate(df.parse(endDate));
            bookBorrowMapper.add(bookBorrow);
            return 200;
        }
    }

    @Override
    public BookBorrow delBookUserById(String id) {
        bookBorrowMapper.del(id);
        return null;
    }

    @Override
    public BookBorrow updateBookUserById(BookBorrow bookBorrow) {
        bookBorrowMapper.update(bookBorrow);
        return null;
    }

    @Override
    public List<Map> getBookUserById(String id) {
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");//显示2017-10-27格式
        List<BookBorrow> bookBorrowList = bookBorrowMapper.getByUserId(id);
        List<Book> bookList = bookService.getBookList();
        List<Map> tempList = new ArrayList<>();

        for (BookBorrow item: bookBorrowList) {
            Book book = bookList.stream().filter((Book b) -> item.getBookId().equalsIgnoreCase(b.getId())).collect(Collectors.toList()).get(0);
            Map<String,Object> tempMap = new HashMap<>();
            tempMap.put("bookName",book.getName());
            tempMap.put("bookNo",book.getNo());
            tempMap.put("author",book.getAuthor());
            tempMap.put("beginDate", sdf2.format(item.getBeginDate()));
            tempMap.put("endDate",sdf2.format(item.getBeginDate()));
            tempMap.put("status",item.getStatus());
            tempMap.put("days",getDay(sdf2.format(item.getEndDate())));
            tempMap.put("url",book.getUrl());
            tempMap.put("operation","");
            tempMap.put("toolTip","");
            tempMap.put("bookStatus","");
            tempMap.put("isShow",true);
            tempList.add(tempMap);
        }

        return  tempList;
    }

    private long getDay(String date){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String nowDate = df.format(new Date());
        return getDaySub(nowDate,date);
    }
}
