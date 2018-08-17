package com.hundsun.book.api;

import com.hundsun.book.model.Book;
import com.hundsun.book.service.BookMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    private BookMapper bookService;

    @RequestMapping(value = "/{no}", method = RequestMethod.GET)
    public Book getBookById(@RequestParam("no") String no){
        return bookService.getBookById(no);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Book> getBookList() {
        return  bookService.getBookList();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Book addBook(@RequestParam("no") String no, @RequestParam("name") String name) {

        Book book = new Book();
        book.no = no;
        book.name = name;
        return book;
    }

}
