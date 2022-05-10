package com.yyz.design.pattern.strategy;

/**
 * 抽象类 鸭子
 * @Author: yyz
 * @Date: 2022/5/10 20:52
 */
public abstract class AbstractDuck {

    /**
     * 显示鸭子信息
     */
    public abstract void display();

    public void fly(){
        System.out.println("鸭子会飞翔...");
    }

    public void swim(){
        System.out.println("鸭子会游泳...");
    }

    public void quack(){
        System.out.println("鸭子嘎嘎叫..");
    }
}
