package com.yyz.design.pattern.strategy;

/**
 * 飞翔牛批 策略
 * @Author: yyz
 * @Date: 2022/5/10 21:14
 */
public class GoodFlyBehavior implements FlyBehaviorStrategy {

    @Override
    public void fly() {
        System.out.println("飞翔技术牛批...");
    }
}
