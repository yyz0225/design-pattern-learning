package com.yyz.design.pattern.principle.singleresponsibility;

/**
 * 车辆实体类
 *
 * @Author: yyz
 * @Date: 2021/9/27 14:56
 */
public class AirVehicle {
    /**
     * 车辆运行方法
     * @param vehicle 具体交通工具
     */
    public void run(String vehicle) {
        System.out.println(vehicle+"在天空飞行....");
    }
}
