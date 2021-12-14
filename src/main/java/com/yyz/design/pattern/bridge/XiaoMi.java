package com.yyz.design.pattern.bridge;

/**
 * 小米手机
 * @Author: yyz
 * @Date: 2021/12/13 17:12
 */
public class XiaoMi implements IBrand {

    @Override
    public void open() {
        System.out.println("小米手机开机...");
    }

    @Override
    public void close() {
        System.out.println("小米手机关闭...");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话...");
    }
}
