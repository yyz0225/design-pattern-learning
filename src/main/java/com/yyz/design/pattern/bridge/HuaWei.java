package com.yyz.design.pattern.bridge;

/**
 * 华为手机
 * @Author: yyz
 * @Date: 2021/12/13 17:12
 */
public class HuaWei implements IBrand {

    @Override
    public void open() {
        System.out.println("HuaWei手机开机...");
    }

    @Override
    public void close() {
        System.out.println("HuaWei手机关机...");
    }

    @Override
    public void call() {
        System.out.println("HuaWei手机打电话...");
    }
}
