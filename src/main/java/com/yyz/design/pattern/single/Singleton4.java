package com.yyz.design.pattern.single;

/**
 * 单例模式之懒汉式(线程安全 同步方法) 效率太低
 * @Author: yyz
 * @Date: 2021/12/7 12:31
 */
public class Singleton4 {

    /**
     * 私有化构造器,阻止外部实例访问
     */
    private Singleton4(){}

    private static Singleton4 SINGLETON_4 = null;


    public static synchronized Singleton4 getInstance(){
        if (SINGLETON_4 == null) {
            SINGLETON_4 = new Singleton4();
        }
        return SINGLETON_4;
    }
}
