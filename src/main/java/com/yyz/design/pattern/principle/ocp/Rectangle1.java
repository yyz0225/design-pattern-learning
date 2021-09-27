package com.yyz.design.pattern.principle.ocp;

/**
 * @Author: yyz
 * @Date: 2021/9/27 17:41
 */
public class Rectangle1 extends BaseShape1 {

    public Rectangle1() {
        super.m_type = 1;
    }

    @Override
    public void drawShape() {
        System.out.println("Rectangle1 画矩形...");
    }
}
