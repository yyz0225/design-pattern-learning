package com.yyz.design.pattern.principle.singleresponsibility;

/**
 * 单一职责原则 类分解模式,遵守了单一职责原则,但是增加了多个类
 * @Author: yyz
 * @Date: 2021/9/27 14:50
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle verhicle = new RoadVehicle();
        verhicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("潜水艇");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("飞机");
    }
}
