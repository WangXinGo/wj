package com.wx.wj.mapper;

import com.wx.wj.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wx
 */
public interface UserMapper {

    /**
     * 测试
     *
     * @param username
     * @return
     */
    User get(String username);
}
