package com.yyz.design.pattern.principle.singleresponsibility;

/**
 * 单一职责原则 一个类里面多个方法,方法级别遵守了单一职责原则
 * @Author: yyz
 * @Date: 2021/9/27 14:50
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 verhicle = new Vehicle2();
        verhicle.run("汽车");
        verhicle.runWater("潜水艇");
        verhicle.runAir("飞机");
    }
}
