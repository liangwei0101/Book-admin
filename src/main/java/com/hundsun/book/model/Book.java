package com.hundsun.book.model;


/**
 * 图书实体的类
 */
public class Book {

    public String no;

    public String name;
    
    public float score;

    public int love_count;

    public int collection_count;

    public int comments_count;

    public char status;

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
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

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getLove_count() {
        return love_count;
    }

    public void setLove_count(int love_count) {
        this.love_count = love_count;
    }

    public int getCollection_count() {
        return collection_count;
    }

    public void setCollection_count(int collection_count) {
        this.collection_count = collection_count;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

}
