package com.yyz.design.pattern.bridge;

/** Vivo手机
 * @Author: yyz
 * @Date: 2021/12/13 17:12
 */
public class ViVo implements IBrand {
    
    @Override
    public void open() {
        System.out.println("ViVo手机开机...");

    }

    @Override
    public void close() {
        System.out.println("ViVo手机关机...");

    }

    @Override
    public void call() {
        System.out.println("ViVo手机打电话...");

    }
}
