package com.hundsun.book.model;

import java.util.Date;

/**
 * 图书评论
 */
public class BookComment {

    private String commentId;

    private String bookNo;

    private String commentContent;

    private float bookScore;

    private String userId;

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

    public float getBookScore() {
        return bookScore;
    }

    public void setBookScore(float bookScore) {
        this.bookScore = bookScore;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }
}
