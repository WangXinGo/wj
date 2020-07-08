package com.wx.wj.service;

import com.wx.wj.pojo.Book;

import java.util.List;

/**
 * @author wx
 */
public interface BookService {

    List<Book> list();

    public void addOrUpdate(Book book);

    public void deleteById(int id);

    public List<Book> listByCategory(int cid);
}
