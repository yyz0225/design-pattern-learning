package com.yyz.design.pattern.strategy;

/**
 * 叫声 策略
 * @Author: yyz
 * @Date: 2022/5/10 21:14
 */
public class QuackBehavior implements QuackBehaviorStrategy {

    @Override
    public void quack() {
        System.out.println("嘎嘎叫...");
    }
}
