package com.yyz.design.pattern.facade;

/**
 * 调光灯
 * @Author: yyz
 * @Date: 2021/12/14 16:13
 */
public class TheaterLight {

    private static final TheaterLight THEATER_LIGHT = new TheaterLight();

    public static TheaterLight getInstance(){
        return THEATER_LIGHT;
    }

    public void on(){
        System.out.println("theater light on");
    }

    public void off(){
        System.out.println("theater light on");
    }

    public void bright(){
        System.out.println("theater light bright");
    }

    public void dim(){
        System.out.println("theater light dim");
    }
}
