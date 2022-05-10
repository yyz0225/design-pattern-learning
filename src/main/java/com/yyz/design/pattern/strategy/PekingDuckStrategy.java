package com.yyz.design.pattern.strategy;

/**
 * 北京鸭
 * @Author: yyz
 * @Date: 2022/5/10 20:56
 */
public class PekingDuckStrategy extends AbstractDuckStrategy {

    /**
     * 北京鸭默认飞翔技术一般,会游泳,会叫
     */
    public PekingDuckStrategy() {
        setFlyBehaviorStrategy(new BadFlyBehavior());
        setQuackBehaviorStrategy(new QuackBehavior());
        setSwimBehaviorStrategy(new GoodSwimBehavior());
    }

    @Override
    public void display() {
        System.out.println("北京鸭...");
    }
}
