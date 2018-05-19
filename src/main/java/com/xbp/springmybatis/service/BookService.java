package com.xbp.springmybatis.service;

import com.xbp.springmybatis.entity.BookEntity;

import java.util.List;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/19 16:32
 */
public interface BookService {
    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    BookEntity getById(long bookId);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<BookEntity> getList();
}
