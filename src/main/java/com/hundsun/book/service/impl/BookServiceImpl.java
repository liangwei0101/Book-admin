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

    public Book getBookById(String no) {
        //todo 业务逻辑
        return bookMapper.getBookById(no);
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

    public BookCountDto getBookCountList() {
        return SetBookCountDtoList();
    }

    private BookCountDto SetBookCountDtoList() {

        int i = 0;
        BookCountDto bookCountDto = new BookCountDto();
        List<Book> tempList = bookMapper.getBookList();
//        bookCountDto.loveBookList = tempList;
//        bookCountDto.mostCommentList = tempList;
//        bookCountDto.scoreBookList = tempList;
//        bookCountDto.wantReadBookList = tempList;
        //SortBookList(bookCountDto);

        List<Map> bookAllList = new ArrayList<Map>();

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
            bookMap.put("bookCount", 0);
//            if(bookAllList){ // 书本已经没有加过


            bookAllList.add(bookMap);

//            }
//            else if(item.getStatus() == '0'){
//                i++;
//                bookMap.put("bookCount",i);
//            }
        }
        return bookCountDto;
    }

    /**
     * 分组和排序
     *
     * @param bookCountDto
     */
    private void SortBookList(BookCountDto bookCountDto) {
        bookCountDto.wantReadBookList.sort((a, b) -> b.getBookThumbsCount().compareTo(a.getNo()));
        bookCountDto.scoreBookList.sort((a, b) -> b.getBookAverageScore().compareTo(a.getBookAverageScore()));
        bookCountDto.mostCommentList.sort((a, b) -> b.getBookCommentCount().compareTo(a.getBookCommentCount()));
        bookCountDto.loveBookList.sort((a, b) -> b.getBookLoveCount().compareTo(a.getBookLoveCount()));
    }
}
