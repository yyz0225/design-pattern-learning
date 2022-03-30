package com.yyz.design.pattern.command;

/**
 * 电视命令接收者
 * @Author: yyz
 * @Date: 2021/12/22 11:06
 */
public class TVReceiver implements IReceiver{

    @Override
    public void on(){
        System.out.println("电视打开了....");
    }

    @Override
    public void off(){
        System.out.println("电视关闭了...");
    }

}
