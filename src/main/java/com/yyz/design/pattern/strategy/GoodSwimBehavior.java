package com.yyz.design.pattern.strategy;

/**
 * 游泳牛批 策略
 * @Author: yyz
 * @Date: 2022/5/10 21:14
 */
public class GoodSwimBehavior implements SwimBehaviorStrategy {


    @Override
    public void swim() {
        System.out.println("游泳技术牛批...");
    }
}
