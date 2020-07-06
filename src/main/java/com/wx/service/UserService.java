package com.wx.service;

import com.wx.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author wx
 */
@Service
public interface UserService {

    public User getByName(String username);

    public User get(String username, String password);
}
