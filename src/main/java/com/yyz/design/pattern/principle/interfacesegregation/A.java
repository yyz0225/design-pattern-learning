package com.yyz.design.pattern.principle.interfacesegregation;

/**
 * @Author: yyz
 * @Date: 2021/9/27 15:32
 */
public class A {

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface1 interface1) {
        interface1.operation2();
    }

    public void depend3(Interface1 interface1) {
        interface1.operation3();
    }

}
