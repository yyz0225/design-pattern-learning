package com.yyz.design.pattern.principle.dependencereversion;

/**
 * @Author: yyz
 * @Date: 2021/9/27 16:20
 */
public class Person1 {

    /**
     * 接收消息
     * @param iReceiver
     */
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
