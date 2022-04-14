package com.yyz.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气数据类,用来管理观察者 使用观察者模式
 * @Author: yyz
 * @Date: 2022/4/14 9:46
 */
public class WeatherDataObserver implements Subject{

    /**
     * 温度
     */
    private float temperature;

    /**
     * 气压
     */
    private float pressure;

    /**
     * 湿度
     */
    private float humidity;

    private List<Observer> observers;

    public WeatherDataObserver() {
        observers = new ArrayList<>();
    }

    /**
     * 设置天气数据
     * @param temperature 温度
     * @param pressure 气压
     * @param humidity 湿度
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 天气数据发生变化时,调用dataChange将数据推送给第三方
        dataChange();
    }

    /**
     * 数据推送
     */
    private void dataChange() {
        notifyAllObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature,pressure,humidity);
        }
    }
}
