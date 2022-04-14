package com.yyz.design.pattern.observer;

/**
 * 观察者接口
 * @Author: yyz
 * @Date: 2022/4/14 10:30
 */
public interface Observer {

    /**
     * 接收输入
     * @param temperature 温度
     * @param pressure 气压
     * @param humidity 湿度
     */
    void update(float temperature, float pressure, float humidity);
}
