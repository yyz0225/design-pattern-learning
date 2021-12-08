package com.yyz.design.pattern.single;

/**
 * 单例模式之饿汉式(静态常量) 线程安全,但是浪费内存
 * @Author: yyz
 * @Date: 2021/12/7 12:31
 */
public class Singleton1 {

    /**
     * 私有化构造器,阻止外部实例访问
     */
    private Singleton1(){}

    /**
     * 类加载时,就创建一个全局的静态实例,线程安全
     */
    private static final Singleton1 SINGLETON_1 = new Singleton1();

    public static Singleton1 getInstance(){
        return SINGLETON_1;
    }
}
