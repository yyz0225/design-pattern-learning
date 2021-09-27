package com.yyz.design.pattern.principle.liskovsubstitution;

/**
 * 里氏替换原则
 *
 * @Author: yyz
 * @Date: 2021/9/27 17:17
 */
public class LiskovSubstitution {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        // 通过依赖,组合,聚合方式,扩展新功能调用新方法
        B b = new B();
        System.out.println("11+3=" + b.func1(11, 3));
        System.out.println("11-3=" + b.func3(11, 3));
        System.out.println("1+2+9=" + b.func2(1, 2));
    }
}
