package com.xbp.springmybatis.service.impl;

import com.xbp.springmybatis.dao.BookEntityMapper;
import com.xbp.springmybatis.entity.BookEntity;
import com.xbp.springmybatis.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/19 16:33
 */
@Service
class BookServiceImpl implements BookService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private BookEntityMapper bookEntityMapper;


    public BookEntity getById(long bookId) {
          return bookEntityMapper.queryById(bookId);
    }

    public List<BookEntity> getList() {
        return bookEntityMapper.queryAll(0, 1000);
    }
}
