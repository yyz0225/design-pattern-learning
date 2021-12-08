package com.yyz.design.pattern.single;

/**
 * 单例模式测试类
 * @Author: yyz
 * @Date: 2021/12/7 12:57
 */
public class SingletonTest {

    public static void main(String[] args) {

        /**
         * 枚举类测试
         */
        Singleton8 singleton8 = Singleton8.SINGLETON_8;
        Singleton8 singleton8_1 = Singleton8.SINGLETON_8;
        System.out.println(singleton8 == singleton8_1);

        System.out.println(singleton8.hashCode());
        System.out.println(singleton8_1.hashCode());
        singleton8.getInstance();
    }

}
