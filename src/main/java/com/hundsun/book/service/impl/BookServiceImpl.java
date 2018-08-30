package com.hundsun.book.service.impl;

import com.hundsun.book.dto.BookCountDto;
import com.hundsun.book.mapper.BookMapper;
import com.hundsun.book.model.Book;
import com.hundsun.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 图书实现
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public Book getBookById(String id) {
        //todo 业务逻辑
        Book aa1= bookMapper.getBookById(id);
        return aa1;
    }

    @Override
    public Book getBookByNo(Integer no) {
        List<Book>  aa= bookMapper.getBookByNo(no);
        return aa.get(0);
    }

    public List<Book> getBookList() {
        List<Book> aa = bookMapper.getBookList();
        return aa;
    }

    public void addBook(Book book) {
        bookMapper.addBook(book);
    }


    public Book updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    public void deleteBook(String no) {
        bookMapper.deleteBook(no);
    }

    public List<Map> getBookCountList() {
        return SetBookCountDtoList();
    }

    private List<Map> SetBookCountDtoList() {
        BookCountDto bookCountDto = new BookCountDto();
        List<Map> bookAllList = new ArrayList<Map>();
        List<Book> tempList = bookMapper.getBookList();

        for (Book item : tempList) {
            Map<String, Object> bookMap = new HashMap<String, Object>();
            bookMap.put("no", item.getNo());
                bookMap.put("name", item.getName());
            bookMap.put("author", item.getAuthor());
            bookMap.put("url", item.getUrl());
            bookMap.put("bookAverageScore", item.getBookAverageScore());
            bookMap.put("bookThumbsCount", item.getBookThumbsCount());
            bookMap.put("bookLoveCount", item.getBookLoveCount());
            bookMap.put("bookCommentCount", item.getBookCommentCount());
            bookMap.put("bookCount", 1);
            bookAllList.add(bookMap);
        }

        for ( int i =  0 ; i < bookAllList.size() -  1 ; i ++ ) {
            int count = 1;
            for ( int j = bookAllList.size() -  1 ; j > i; j -- ) {
                if (bookAllList.get(j).get("no").equals(bookAllList.get(i).get("no"))) {
                    count++;
                    bookAllList.remove(j);
                    bookAllList.get(i).put("bookCount",count);
                }
            }
        }

        return bookAllList;
    }
}
