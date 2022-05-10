package com.yyz.design.pattern.strategy;

/**
 * 不会游泳 策略
 * @Author: yyz
 * @Date: 2022/5/10 21:14
 */
public class NoSwimBehavior implements SwimBehaviorStrategy {


    @Override
    public void swim() {
        System.out.println("不会游泳...");
    }
}
