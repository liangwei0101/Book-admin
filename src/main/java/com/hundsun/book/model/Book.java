package com.hundsun.book.model;


import java.util.List;

/**
 * 图书实体的类
 */
public class Book implements Comparable<Book> {

    private String id;

    private String no;

    private String name;

    private String author;

    private String status;

    private String introduce;

    private String url;

    private Integer bookLoveCount;

    private Float bookAverageScore;

    private Integer bookCost;

    private List<BookComment> bookCommentList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public Integer getBookLoveCount() {
        return bookLoveCount;
    }

    public void setBookLoveCount(Integer bookloveCount) {
        this.bookLoveCount = bookloveCount;
    }

    public Integer getBookCost() {
        return bookCost;
    }

    public void setBookCost(Integer bookCost) {
        this.bookCost = bookCost;
    }

    public List<BookComment> getBookCommentList() {
        return bookCommentList;
    }

    public void setBookCommentList(List<BookComment> bookCommentList) {
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
