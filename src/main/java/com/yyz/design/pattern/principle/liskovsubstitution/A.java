package com.yyz.design.pattern.principle.liskovsubstitution;

/**
 * 求两个数的差
 * @Author: yyz
 * @Date: 2021/9/27 17:12
 */
public class A extends Base {

    /**
     * 求差
     * @param num1 参数1
     * @param num2 参数2
     * @return 差
     */
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}
