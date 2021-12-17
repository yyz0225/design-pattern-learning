package com.yyz.design.pattern.flyweight;

/**
 * 用户 不可共享状态
 * @Author: yyz
 * @Date: 2021/12/16 12:28
 */
public class User {

    private String name;

    public User(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
