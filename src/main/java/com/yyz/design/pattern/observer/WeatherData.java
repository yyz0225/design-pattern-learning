package com.yyz.design.pattern.observer;

/**
 * 天气数据
 * @Author: yyz
 * @Date: 2022/4/14 9:46
 */
public class WeatherData {

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
     * 第三方接入
     */
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
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
