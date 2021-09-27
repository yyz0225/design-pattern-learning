package com.yyz.design.pattern.principle.interfacesegregation;

/**
 * @Author: yyz
 * @Date: 2021/9/27 15:32
 */
public class C {

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface1 interface1) {
        interface1.operation4();
    }

    public void depend5(Interface1 interface1) {
        interface1.operation5();
    }

}
