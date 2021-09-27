package com.yyz.design.pattern.principle.interfacesegregation;

/**
 * @Author: yyz
 * @Date: 2021/9/27 15:32
 */
public class C1 {

    public void depend1(Interface11 interface11) {
        interface11.operation1();
    }

    public void depend4(Interface13 interface13) {
        interface13.operation4();
    }

    public void depend5(Interface13 interface13) {
        interface13.operation5();
    }

}
