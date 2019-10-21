package com.zqz.myproject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author 囚牛
 * @Desc 这是一段描述
 * @Time 2019/10/21
 */
@Component
@ConfigurationProperties(prefix = "boy")
public class Boy {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    private int age;


}
