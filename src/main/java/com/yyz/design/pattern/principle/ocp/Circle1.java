package com.yyz.design.pattern.principle.ocp;

/**
 * @Author: yyz
 * @Date: 2021/9/27 17:41
 */
public class Circle1 extends BaseShape1 {

    public Circle1() {
        super.m_type = 2;
    }


    @Override
    public void drawShape() {
        System.out.println("Circle1 画圆形....");
    }
}
