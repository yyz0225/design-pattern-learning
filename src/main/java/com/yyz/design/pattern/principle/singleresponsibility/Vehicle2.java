package com.yyz.design.pattern.principle.singleresponsibility;

/**
 * 车辆实体类
 *
 * @Author: yyz
 * @Date: 2021/9/27 14:56
 */
public class Vehicle2 {
    /**
     * 车辆运行方法
     * @param vehicle 具体交通工具
     */
    public void run(String vehicle) {
        System.out.println(vehicle+"在公路上运行....");
    }
    /**
     * 车辆运行方法
     * @param vehicle 具体交通工具
     */
    public void runAir(String vehicle) {
        System.out.println(vehicle+"在天空上飞行....");
    }
    /**
     * 车辆运行方法
     * @param vehicle 具体交通工具
     */
    public void runWater(String vehicle) {
        System.out.println(vehicle+"在水里遨游....");
    }


}
