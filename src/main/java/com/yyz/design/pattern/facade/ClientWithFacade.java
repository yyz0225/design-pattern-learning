package com.yyz.design.pattern.facade;

/**
 * 外观模式的 客户端调用类
 * @Author: yyz
 * @Date: 2021/12/24 10:11
 */
public class ClientWithFacade {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        // homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
