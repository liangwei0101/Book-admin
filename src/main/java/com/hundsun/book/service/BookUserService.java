package com.hundsun.book.service;

import com.hundsun.book.model.BookUser;
import org.apache.ibatis.annotations.Param;
import org.omg.PortableInterceptor.INACTIVE;

import java.text.ParseException;

public interface BookUserService {

    void AddBookUser(Integer bookNo, String userId, String beginDate, String endDate) throws ParseException;

    BookUser delBookUserById(@Param("id") String id);

    BookUser updateBookUserById(BookUser bookUser);

    BookUser getBookUserById(@Param("id") String id);
}
