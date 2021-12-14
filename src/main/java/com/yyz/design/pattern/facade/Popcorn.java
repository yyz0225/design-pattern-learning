package com.yyz.design.pattern.facade;

/**
 * 爆米花
 * @Author: yyz
 * @Date: 2021/12/14 15:57
 */
public class Popcorn {

    /**
     * 单例模式 饿汉式实现
     */
    private static final Popcorn POPCORN = new Popcorn();

    public static Popcorn getInstance(){
        return POPCORN;
    }

    public void on(){
        System.out.println("popcorn on");
    }

    public void off(){
        System.out.println("popcorn off");
    }

    public void pop(){
        System.out.println("popcorn pop");
    }
}
