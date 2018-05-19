package com.xbp.springmybatis.entity;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/19 16:16
 * /**
 *  * 图书实体
 */
public class BookEntity {

    private Integer bookId;
    private String name;

    private Integer number;

    public BookEntity() {
    }

    public BookEntity(Integer bookId, String name, Integer number) {
        this.bookId = bookId;
        this.name = name;
        this.number = number;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}

