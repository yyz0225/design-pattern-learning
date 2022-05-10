package com.yyz.design.pattern.strategy;

/**
 * 不会飞翔策略
 * @Author: yyz
 * @Date: 2022/5/10 21:14
 */
public class BadFlyBehavior implements FlyBehaviorStrategy {

    @Override
    public void fly() {
        System.out.println("飞翔技术一般...");
    }
}
