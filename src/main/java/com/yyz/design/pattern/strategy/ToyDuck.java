package com.yyz.design.pattern.strategy;

/**
 * 玩具鸭
 * @Author: yyz
 * @Date: 2022/5/10 20:56
 */
public class ToyDuck extends AbstractDuck {

    @Override
    public void display() {
        System.out.println("北京鸭...");
    }

    /**
     * 玩具鸭不能飞翔,所以需要重写fly方法
     */
    @Override
    public void fly(){
        System.out.println("北京鸭不能飞翔...");
    }

    /**
     * 玩具鸭不能游泳,所以需要重写swim方法
     */
    @Override
    public void swim(){
        System.out.println("北京鸭不能游泳...");
    }

    /**
     * 玩具鸭不能叫,所以需要重写fly方法
     */
    @Override
    public void quack(){
        System.out.println("北京鸭不能叫...");
    }
}
