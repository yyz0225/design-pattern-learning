package com.yyz.design.pattern.strategy;

/**
 * 北京鸭
 * @Author: yyz
 * @Date: 2022/5/10 20:56
 */
public class PekingDuck extends AbstractDuck {

    @Override
    public void display() {
        System.out.println("北京鸭...");
    }

    /**
     * 北京鸭不能飞翔,所以需要重写fly方法
     */
    @Override
    public void fly(){
        System.out.println("北京鸭不能飞翔...");
    }
}
