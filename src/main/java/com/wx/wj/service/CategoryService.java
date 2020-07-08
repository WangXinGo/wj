package com.wx.wj.service;

import com.wx.wj.mapper.CategoryMapper;
import com.wx.wj.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;

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
    public List<Category> getAllCategory();

    /**
     * get
     *
     * @param id
     * @return
     */
    public Category selectById(int id);

}
