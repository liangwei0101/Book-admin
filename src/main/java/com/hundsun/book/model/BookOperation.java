package com.hundsun.book.model;

import java.util.Date;

/**
 * 图书评论
 */
public class BookOperation {

    private String commentId;

    private String bookNo;

    private String commentContent;

    private int commentLoveCountStatus;

    private float bookScoreStatus;

    private Integer bookThumbsStatus;

    private String userName;

    private String commentTime;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getBookThumbsStatus() {
        return bookThumbsStatus;
    }

    public void setBookThumbsStatus(Integer bookThumbsStatus) {
        this.bookThumbsStatus = bookThumbsStatus;
    }

    public int getCommentLoveCountStatus() {
        return commentLoveCountStatus;
    }

    public void setCommentLoveCountStatus(int commentLoveCountStatus) {
        this.commentLoveCountStatus = commentLoveCountStatus;
    }

    public float getBookScoreStatus() {
        return bookScoreStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public void setBookScoreStatus(float bookScoreStatus) {
        this.bookScoreStatus = bookScoreStatus;
    }
}
