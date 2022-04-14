package com.yyz.design.pattern.observer;

/**
 * 显示当前的天气情况
 * @Author: yyz
 * @Date: 2022/4/14 9:35
 */
public class BaiDuObserver implements Observer{

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

    /**
     * 更新天气情况 由WeatherData调用,使用推送模式
     * @param temperature 温度
     * @param pressure 气压
     * @param humidity 湿度
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    /**
     * 显示天气情况
     */
    private void display() {
        System.out.println("========BaiDu Today m temperature:"+temperature+"======");
        System.out.println("========BaiDu m humidity:"+humidity+"======");
        System.out.println("========BaiDu m pressure:"+pressure+"======");
    }


    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
