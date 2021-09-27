package com.yyz.design.pattern.principle.dependencereversion;

/**
 * @Author: yyz
 * @Date: 2021/9/27 16:20
 */
public class Person {

    /**
     * 接收消息
     * @param email
     */
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
