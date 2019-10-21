package com.zqz.myproject.service.impl;

import com.zqz.myproject.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Author 囚牛
 * @Desc 这是一段描述
 * @Time 2019/10/21
 */
@Service
public class TestServiceImpl implements TestService {
    
    @Override
    public String hello() {
        return "hello";
    }
}
