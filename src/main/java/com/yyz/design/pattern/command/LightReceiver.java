package com.yyz.design.pattern.command;

/**
 * 命令接收者(命令执行者) 灯光
 * @Author: yyz
 * @Date: 2021/12/21 16:07
 */
public class LightReceiver {

    public void on(){
        System.out.println("电灯打开了....");
    }

    public void off(){
        System.out.println("电灯关闭了....");
    }
}
