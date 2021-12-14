package com.yyz.design.pattern.facade;

/**
 * 家庭影院 外观模式
 * @Author: yyz
 * @Date: 2021/12/14 16:17
 */
public class HomeTheaterFacade {

    /**
     * 调光灯
     */
    private TheaterLight theaterLight;

    /**
     * 爆米花
     */
    private Popcorn popcorn;

    /**
     * 立体声
     */
    private Stereo stereo;

    /**
     * 投影仪
     */
    private Projector projector;

    /**
     * 屏幕
     */
    private Screen screen;

    /**
     * dvd播放器
     */
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        super();
        theaterLight = TheaterLight.getInstance();
        popcorn = Popcorn.getInstance();
        stereo = Stereo.getInstance();
        projector = Projector.getInstance();
        screen = Screen.getInstance();
        dvdPlayer = DVDPlayer.getInstance();
    }

    public void read(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }

    public void pause(){
        dvdPlayer.pause();
    }
}
