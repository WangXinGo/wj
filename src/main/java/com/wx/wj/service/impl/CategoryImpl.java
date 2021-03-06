package com.wx.wj.service.impl;

import com.wx.wj.mapper.CategoryMapper;
import com.wx.wj.pojo.Category;
import com.wx.wj.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wx
 */
@Service
public class CategoryImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.getAllCategorys();
    }

    @Override
    public Category get(int id) {
        Category category = categoryMapper.selectById(id);
        return category;
    }
}
