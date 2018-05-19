package com.xbp.springmybatis.dao;

import com.xbp.springmybatis.entity.BookEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/19 16:18
 */

@Repository
public interface BookEntityMapper {

    /**
     * 通过图书id查询单个图书
     * @param bookId
     * @return
     */
    BookEntity queryById(long bookId);
    /**
     * 查询所有图书
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<BookEntity> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 减少馆藏数量
     *
     * @param bookId
     * @return 如果影响行数等于>1，表示更新的记录行数
     */
    int reduceNumber(long bookId);
}
