package com.hundsun.book.service;

import com.hundsun.book.model.BookBorrow;
import org.apache.ibatis.annotations.Param;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface BookBorrowService {

    Integer AddBookBorrow(Integer bookNo, String userId, String beginDate, String endDate) throws ParseException;

    BookBorrow delBookUserById(@Param("bookId") String bookId);

    BookBorrow updateBookUserById(BookBorrow bookBorrow);

    List<Map> getBookUserById(@Param("bookId") String bookId);
}
