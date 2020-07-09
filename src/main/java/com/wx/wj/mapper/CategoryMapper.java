package com.wx.wj.mapper;

import com.wx.wj.pojo.Category;

import java.util.List;

/**
 * @author wx
 */
public interface CategoryMapper {

        List<Category> getAllCategorys();

        Category selectById(int id);
}
