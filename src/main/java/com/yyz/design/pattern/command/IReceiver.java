package com.yyz.design.pattern.command;

/**
 * 抽象命令接收者
 * @Author: yyz
 * @Date: 2022/3/30 15:38
 */
public interface IReceiver {

    /**
     * 打开
     */
    void on();

    /**
     * 关闭
     */
    void off();
}
