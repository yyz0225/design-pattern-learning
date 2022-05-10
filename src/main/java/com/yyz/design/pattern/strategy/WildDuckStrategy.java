package com.yyz.design.pattern.strategy;

/**
 * 野鸭
 * @Author: yyz
 * @Date: 2022/5/10 20:56
 */
public class WildDuckStrategy extends AbstractDuckStrategy {

    /**
     * 野鸭默认飞翔技术牛批,会游泳,会叫
     */
    public WildDuckStrategy() {
        setFlyBehaviorStrategy(new GoodFlyBehavior());
        setQuackBehaviorStrategy(new QuackBehavior());
        setSwimBehaviorStrategy(new GoodSwimBehavior());
    }

    @Override
    public void display() {
        System.out.println("野鸭...");
    }
}
