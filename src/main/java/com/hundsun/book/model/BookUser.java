package com.hundsun.book.model;

import java.util.Date;

public class BookUser {

    private String userId;

    private String bookId;

    private char bookStatus;

    private Date BeginDate;

    private Date EndDate;

    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public char getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(char bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Date getBeginDate() {
        return BeginDate;
    }

    public void setBeginDate(Date beginDate) {
        BeginDate = beginDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
