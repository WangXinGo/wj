package com.wx.wj.service.impl;

import com.wx.wj.mapper.BookMapper;
import com.wx.wj.pojo.Book;
import com.wx.wj.service.BookService;
import com.wx.wj.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wx
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;
    @Autowired
    CategoryService categoryService;

    @Override
    public List<Book> list() {

    }

    @Override
    public void addOrUpdate(Book book) {

    }

    @Override
    public void deleteById(int id) {

}

    @Override
    public List<Book> listByCategory(int cid) {

    }
}
