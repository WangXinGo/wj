package com.wx.wj.service;

import com.wx.wj.pojo.Book;

import java.util.List;

/**
 * @author wx
 */
public interface BookService {

    List<Book> list();

    void addOrUpdate(Book book);

    void deleteById(int id);

    List<Book> listByCategory(int cid);
}
