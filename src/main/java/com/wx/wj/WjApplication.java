package com.wx.wj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangx
 */
@SpringBootApplication
@MapperScan(basePackages = "com.wx.wj.mapper")
public class WjApplication {

    public static void main(String[] args) {
        SpringApplication.run(WjApplication.class, args);
    }

}
