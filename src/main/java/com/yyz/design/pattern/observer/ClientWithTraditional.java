package com.yyz.design.pattern.observer;

/**
 * 客户端
 * @Author: yyz
 * @Date: 2022/4/14 9:50
 */
public class ClientWithTraditional {

    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(20,1000,30);

        System.out.println("===============温度变化================");

        weatherData.setData(25,1010,20);
    }
}
