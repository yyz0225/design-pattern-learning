package com.yyz.design.pattern.facade;

/**
 * 立体声
 * @Author: yyz
 * @Date: 2021/12/14 16:10
 */
public class Stereo {

    private static final Stereo STEREO = new Stereo();

    public static Stereo getInstance(){
        return STEREO;
    }

    public void on(){
        System.out.println("stereo on");
    }

    public void off(){
        System.out.println("stereo off");
    }

    public void up(){
        System.out.println("stereo up");
    }

    public void down(){
        System.out.println("stereo down");
    }
}
