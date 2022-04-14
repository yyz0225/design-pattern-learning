package com.yyz.design.pattern.observer;

/**
 * 客户端 使用观察者模式
 * @Author: yyz
 * @Date: 2022/4/14 9:50
 */
public class ClientWithObserver {

    public static void main(String[] args) {

        Observer baiDuObserver = new BaiDuObserver();

        Observer sinaObserver = new SinaObserver();

        WeatherDataObserver weatherData = new WeatherDataObserver();
        weatherData.registerObserver(baiDuObserver);
        weatherData.registerObserver(sinaObserver);

        weatherData.setData(30f,50f,33.3f);

        System.out.println("===========移除新浪=========");
        weatherData.removeObserver(sinaObserver);
        weatherData.setData(30f,50f,33.3f);
    }
}
