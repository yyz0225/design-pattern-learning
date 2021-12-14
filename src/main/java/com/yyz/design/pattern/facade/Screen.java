package com.yyz.design.pattern.facade;

/**
 * 屏幕
 * @Author: yyz
 * @Date: 2021/12/14 16:08
 */
public class Screen {

    private static final Screen SCREEN = new Screen();

    public static Screen getInstance(){
        return SCREEN;
    }

    public void up(){
        System.out.println("screen up");
    }

    public void down(){
        System.out.println("screen down");
    }
}
