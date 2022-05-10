package com.yyz.design.pattern.strategy;

/**
 * 策略模式 测试类
 * @Author: yyz
 * @Date: 2022/5/10 21:31
 */
public class ClientWithStrategy {

    public static void main(String[] args) {
        AbstractDuckStrategy pekingDuckStrategy = new PekingDuckStrategy();
        pekingDuckStrategy.display();
        pekingDuckStrategy.fly();
        pekingDuckStrategy.swim();
        pekingDuckStrategy.quack();

        // 修改北京鸭飞翔策略为不会飞翔
        System.out.println("====给北京鸭重新制定飞翔策略====");
        pekingDuckStrategy.setFlyBehaviorStrategy(new NoFlyBehavior());
        pekingDuckStrategy.fly();
    }
}
