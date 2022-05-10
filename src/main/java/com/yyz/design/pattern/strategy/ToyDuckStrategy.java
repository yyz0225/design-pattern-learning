package com.yyz.design.pattern.strategy;

/**
 * 玩具鸭
 * @Author: yyz
 * @Date: 2022/5/10 20:56
 */
public class ToyDuckStrategy extends AbstractDuckStrategy {

    /**
     * 玩具鸭不会叫,不会游泳,不会飞翔
     */
    public ToyDuckStrategy() {
        setFlyBehaviorStrategy(new NoFlyBehavior());
        setQuackBehaviorStrategy(new NoQuackBehavior());
        setSwimBehaviorStrategy(new NoSwimBehavior());
    }

    @Override
    public void display() {
        System.out.println("玩具鸭...");
    }
}
