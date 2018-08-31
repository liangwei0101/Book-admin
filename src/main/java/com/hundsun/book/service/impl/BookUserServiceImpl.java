package com.hundsun.book.service.impl;

import com.hundsun.book.mapper.BookCommentMapper;
import com.hundsun.book.mapper.BookMapper;
import com.hundsun.book.mapper.BookUserMapper;
import com.hundsun.book.model.Book;
import com.hundsun.book.model.BookUser;
import com.hundsun.book.service.BookUserService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BookUserServiceImpl implements BookUserService {

    @Autowired
    private BookUserMapper bookUserMapper;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public void AddBookUser(Integer bookNo, String userId, String beginDate, String endDate) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        List<Book> bookList =  bookMapper.getBookByNo(bookNo);
        Book book = bookList.get(0);
        BookUser bookUser = new BookUser();

        bookUser.setBookId(book.getId());
        bookUser.setUserId(userId);
        bookUser.setBookStatus('1');
        bookUser.setBeginDate(df.parse(beginDate));
        bookUser.setEndDate(df.parse(endDate));

        bookUserMapper.AddBookUser(bookUser);
    }

    @Override
    public BookUser delBookUserById(String id) {
        bookUserMapper.delBookUserById(id);
        return null;
    }

    @Override
    public BookUser updateBookUserById(BookUser bookUser) {
        bookUserMapper.updateBookUserById(bookUser);
        return null;
    }

    @Override
    public BookUser getBookUserById(String id) {
        bookUserMapper.delBookUserById(id);
        return null;
    }
}
