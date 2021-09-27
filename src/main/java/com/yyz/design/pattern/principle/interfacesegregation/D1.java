package com.yyz.design.pattern.principle.interfacesegregation;

/**
 * @Author: yyz
 * @Date: 2021/9/27 15:28
 */
public class D1 implements Interface11,Interface13 {
    @Override
    public void operation1() {
        System.out.println("D1 实现了operation1...");
    }

    @Override
    public void operation4() {
        System.out.println("D1 实现了operation4...");
    }

    @Override
    public void operation5() {
        System.out.println("D1 实现了operation5...");
    }
}
