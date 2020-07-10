package com.wx.wj.mapper;

import com.wx.wj.pojo.Book;

import java.util.List;

/**
 * @author wx
 */
public interface BookMapper {

    /**
     * getAllBooks
     *
     * @return
     */
    List<Book> getAllBooks();

    /**
     * saveOrUpdate
     *
     * @param book
     */
    void saveOrUpdate(Book book);

    /**
     * deleteById
     *
     * @param id
     */
    void deleteById(int id);

    /**
     * getByCategory
     *
     * @param cid
     * @return
     */
    List<Book> getByCategory(int cid);
}
