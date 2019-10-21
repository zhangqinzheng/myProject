package com.zqz.myproject.service.impl;

import com.zqz.myproject.config.Boy;
import com.zqz.myproject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author 囚牛
 * @Desc 这是一段描述
 * @Time 2019/10/21
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private Boy boy;

    @Override
    public String hello() {
        return "测试配置文件取值:" + boy.getName() + "-----" + boy.getAge();
    }


}
