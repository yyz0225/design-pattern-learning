package com.yyz.design.pattern.principle.singleresponsibility;

/**
 * 违反了单一职责原则
 * @Author: yyz
 * @Date: 2021/9/27 14:50
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle verhicle = new Vehicle();
        verhicle.run("汽车");
        verhicle.run("轮船");
        verhicle.run("飞机");
    }
}
