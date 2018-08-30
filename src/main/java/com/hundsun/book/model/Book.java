package com.hundsun.book.model;


import java.util.List;

/**
 * 图书实体的类
 */
public class Book implements Comparable<Book> {

    private String id;

    private Integer no;

    private String name;

    private String author;

    private char status;

    private String introduce;

    private String url;

    private Integer bookThumbsCount;

    private Integer bookLoveCount;

    private Float bookAverageScore;

    private Integer bookCommentCount;

    private Integer bookCost;

    private List<BookOperation> bookCommentList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Float getBookAverageScore() {
        return bookAverageScore;
    }

    public void setBookAverageScore(Float bookAverageScore) {
        this.bookAverageScore = bookAverageScore;
    }

    public Integer getBookThumbsCount() {
        return bookThumbsCount;
    }

    public void setBookThumbsCount(Integer bookThumbsCount) {
        this.bookThumbsCount = bookThumbsCount;
    }

    public Integer getBookLoveCount() {
        return bookLoveCount;
    }

    public void setBookLoveCount(Integer bookloveCount) {
        this.bookLoveCount = bookloveCount;
    }

    public Integer getBookCommentCount() {
        return bookCommentCount;
    }

    public void setBookCommentCount(Integer bookCommentCount) {
        this.bookCommentCount = bookCommentCount;
    }

    public Integer getBookCost() {
        return bookCost;
    }

    public void setBookCost(Integer bookCost) {
        this.bookCost = bookCost;
    }

    public List<BookOperation> getBookCommentList() {
        return bookCommentList;
    }

    public void setBookCommentList(List<BookOperation> bookCommentList) {
        this.bookCommentList = bookCommentList;
    }

    @Override
    public int compareTo(Book o) {
        float i = this.getBookAverageScore() - o.getBookAverageScore();
        if(i == 0){
            return (int)(this.getBookAverageScore() - o.getBookAverageScore());
        }
        return (int)i;
    }
}
