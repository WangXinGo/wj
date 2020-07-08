package com.wx.wj.controller;

import com.wx.wj.pojo.Category;
import com.wx.wj.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wx
 */
@RestController
public class LibraryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/api/test1")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @GetMapping("test")
    public Category selectById(int id){
        Category category = categoryService.selectById(id);
        return category;
    }
}
