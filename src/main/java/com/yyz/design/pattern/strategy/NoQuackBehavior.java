package com.yyz.design.pattern.strategy;

/**
 * 不会叫声 策略
 * @Author: yyz
 * @Date: 2022/5/10 21:14
 */
public class NoQuackBehavior implements QuackBehaviorStrategy {

    @Override
    public void quack() {
        System.out.println("不会嘎嘎叫...");
    }
}
