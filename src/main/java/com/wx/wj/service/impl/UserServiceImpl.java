package com.wx.wj.service.impl;

import com.wx.wj.mapper.UserMapper;
import com.wx.wj.pojo.User;
import com.wx.wj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wx
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User get(String username) {
        return userMapper.get(username);
    }
}