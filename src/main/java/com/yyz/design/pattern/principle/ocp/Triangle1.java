package com.yyz.design.pattern.principle.ocp;

/**
 * @Author: yyz
 * @Date: 2021/9/27 17:43
 */
public class Triangle1 extends BaseShape1{

    public Triangle1() {
        super.m_type = 3;
    }

    @Override
    public void drawShape() {
        System.out.println("Triangle1 画三角形....");
    }
}
