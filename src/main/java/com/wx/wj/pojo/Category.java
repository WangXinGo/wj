package com.wx.wj.pojo;

import java.io.Serializable;

/**
 * @author wx
 */
public class Category implements Serializable {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Category{" +
//                    "id=" + id +
//                    ", name='" + name + '\'' +
//                    '}';
//    };

}

