package com.zqz.myproject.controller;

import com.zqz.myproject.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 囚牛
 * @Desc 这是一段描述
 * @Time 2019/10/21
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("执行完成");
        return testService.hello();
    }

}
