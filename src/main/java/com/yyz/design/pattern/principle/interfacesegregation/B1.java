package com.yyz.design.pattern.principle.interfacesegregation;

/**
 * @Author: yyz
 * @Date: 2021/9/27 15:28
 */
public class B1 implements Interface11,Interface12 {
    @Override
    public void operation1() {
        System.out.println("B1 实现了operation1...");
    }

    @Override
    public void operation2() {
        System.out.println("B1 实现了operation2...");
    }

    @Override
    public void operation3() {
        System.out.println("B1 实现了operation3...");
    }
}
