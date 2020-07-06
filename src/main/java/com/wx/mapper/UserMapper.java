package com.wx.mapper;

import com.wx.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wx
 */
@Mapper
public interface UserMapper {

    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
