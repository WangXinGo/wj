package com.wx.wj.mapper;

import com.wx.wj.pojo.Category;

import java.util.List;

/**
 * @author wx
 */
public interface CategoryMapper {

        List<Category> getAllCategory();

        Category selectById(int id);
}
