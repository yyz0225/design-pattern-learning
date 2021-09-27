package com.yyz.design.pattern.principle.interfacesegregation;

/**
 * 违反了接口隔离原则
 * A类通过B类间接依赖了Interface1,但是只使用了接口中的1,2,3方法
 * C类通过D类间接依赖了Interface1,但是只使用了接口中的1,4,5方法
 * @Author: yyz
 * @Date: 2021/9/27 15:53
 */
public class Segregation11 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.depend1(new B1());
        a.depend2(new B1());
        a.depend3(new B1());

        C1 c = new C1();
        c.depend1(new D1());
        c.depend4(new D1());
        c.depend5(new D1());
    }
}
