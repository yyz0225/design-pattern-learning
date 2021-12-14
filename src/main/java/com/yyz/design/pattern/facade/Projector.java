package com.yyz.design.pattern.facade;

/**
 * 投影仪
 * @Author: yyz
 * @Date: 2021/12/14 15:57
 */
public class Projector {

    /**
     * 单例模式 饿汉式实现
     */
    private static final Projector PROJECTOR = new Projector();

    public static Projector getInstance(){
        return PROJECTOR;
    }

    public void on(){
        System.out.println("projector on");
    }

    public void off(){
        System.out.println("projector off");
    }

    public void focus(){
        System.out.println("projector focus");
    }
}
