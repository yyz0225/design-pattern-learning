package com.yyz.design.pattern.principle.liskovsubstitution;

/**
 * @Author: yyz
 * @Date: 2021/9/27 17:12
 */
public class B extends Base {

    private A a = new A();

    /**
     * 求和 继承同一个类,不小心重写了A类的方法,可能是无意识
     * @param num1 参数1
     * @param num2 参数2
     * @return 差
     */
    public int func1(int num1, int num2){
        return num1 + num2;
    }

    /**
     * 求和
     * @param num1 参数1
     * @param num2 参数2
     * @return 差
     */
    public int func2(int num1, int num2){
        return num1 + num2 + 9;
    }

    /**
     * 求差 要使用A的方法,需要额外添加A的依赖
     * @param num1 参数1
     * @param num2 参数2
     * @return 差
     */
    public int func3(int num1, int num2){
        return this.a.func1(num1,num2);
    }
}
