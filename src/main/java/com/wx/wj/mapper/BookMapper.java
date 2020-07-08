package com.wx.wj.mapper;

import com.wx.wj.pojo.Book;

import java.util.List;

/**
 * @author wx
 */
public interface BookMapper {

    /**
     * list
     *
     * @return
     */
    List<Book> list();

    /**
     * addOrUpdate
     *
     * @param book
     */
    void addOrUpdate(Book book);

    /**
     * deleteById
     *
     * @param id
     */
    void deleteById(int id);

    /**
     * listByCategory
     *
     * @param cid
     * @return
     */
    List<Book> listByCategory(int cid);

}
