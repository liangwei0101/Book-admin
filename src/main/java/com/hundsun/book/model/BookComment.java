package com.hundsun.book.model;

/**
 * 图书评论
 */
public class BookComment {

    private String commentId;

    private String bookNo;

    private String commentContent;

    private int commentLoveCount;

    private float bookScore;

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

    public int getCommentLoveCount() {
        return commentLoveCount;
    }

    public void setCommentLoveCount(int commentLoveCount) {
        this.commentLoveCount = commentLoveCount;
    }

    public float getBookScore() {
        return bookScore;
    }

    public void setBookScore(float bookScore) {
        this.bookScore = bookScore;
    }

}
