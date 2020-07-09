package com.wx.wj.service;

import com.wx.wj.pojo.Category;

import java.util.List;

/**
 * @author wx
 */
public interface CategoryService {

    /**
     * list
     *
     * @return
     */
    public List<Category> list();

    /**
     * get
     *
     * @param id
     * @return
     */
    public Category get(int id);

}
