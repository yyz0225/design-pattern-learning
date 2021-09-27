package com.yyz.design.pattern.principle.interfacesegregation;

/**
 * 违反了接口隔离原则
 * A类通过B类间接依赖了Interface1,但是只使用了接口中的1,2,3方法
 * C类通过D类间接依赖了Interface1,但是只使用了接口中的1,4,5方法
 * @Author: yyz
 * @Date: 2021/9/27 15:53
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}
