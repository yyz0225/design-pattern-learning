package com.yyz.design.pattern.principle.interfacesegregation;

/**
 * @Author: yyz
 * @Date: 2021/9/27 15:28
 */
public class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D 实现了operation1...");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了operation2...");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了operation3...");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了operation4...");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了operation5...");
    }
}
