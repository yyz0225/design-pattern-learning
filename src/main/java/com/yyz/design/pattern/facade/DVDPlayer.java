package com.yyz.design.pattern.facade;

/**
 * DVD播放器
 * @Author: yyz
 * @Date: 2021/12/14 15:57
 */
public class DVDPlayer {

    /**
     * 单例模式 饿汉式实现
     */
    private static final DVDPlayer DVD_PLAYER = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return DVD_PLAYER;
    }

    public void on(){
        System.out.println("dvd on");
    }

    public void off(){
        System.out.println("dvd off");
    }

    public void pause(){
        System.out.println("dvd pause");
    }

    public void play(){
        System.out.println("dvd play");
    }
}
