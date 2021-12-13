package com.yyz.design.pattern.adapter;

/**
 * 接口适配器模式,实现自己想要实现的方法
 * @Author: yyz
 * @Date: 2021/12/9 20:43
 */
public class InterfaceAdapter extends AbstractAdapter{

    @Override
    public void m1() {
        System.out.println("我只想实现一个m1方法哟,,,,,");
    }
}
