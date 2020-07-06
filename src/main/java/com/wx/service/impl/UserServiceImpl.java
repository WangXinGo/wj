package com.wx.service.impl;

import com.wx.mapper.UserMapper;
import com.wx.pojo.User;
import com.wx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wx
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getByName(String username){
        return userMapper.findByUsername(username);
    }

    @Override
    public User get(String username, String password) {
        return userMapper.getByUsernameAndPassword(username, password);
    }
}
