package com.yyz.design.pattern.principle.interfacesegregation;

/**
 * @Author: yyz
 * @Date: 2021/9/27 15:32
 */
public class A1 {

    public void depend1(Interface11 interface11) {
        interface11.operation1();
    }

    public void depend2(Interface12 interface12) {
        interface12.operation2();
    }

    public void depend3(Interface12 interface12) {
        interface12.operation3();
    }

}
