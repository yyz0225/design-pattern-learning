package com.yyz.design.pattern.single;

/**
 * 单例模式之饿汉式(静态代码块) 线程安全,但是浪费内存
 * @Author: yyz
 * @Date: 2021/12/7 12:31
 */
public class Singleton2 {

    /**
     * 私有化构造器,阻止外部实例访问
     */
    private Singleton2(){}

    /**
     * 类加载时,就创建一个全局的静态实例,线程安全
     */
    private static final Singleton2 SINGLETON_2;

    static {
        SINGLETON_2 = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return SINGLETON_2;
    }
}
