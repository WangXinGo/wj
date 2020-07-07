package com.wx.wj.service;

import com.wx.wj.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author wx
 */
public interface UserService {

    /**
     * 查询
     *
     * @param username
     * @return
     */
    public User get(String username);
}
