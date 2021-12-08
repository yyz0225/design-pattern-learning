package com.yyz.design.pattern.single;

/**
 * 单例模式之懒汉式(线程不安全) 只能在单线程环境下使用
 * @Author: yyz
 * @Date: 2021/12/7 12:31
 */
public class Singleton3 {

    /**
     * 私有化构造器,阻止外部实例访问
     */
    private Singleton3(){}

    private static Singleton3 SINGLETON_3 = null;


    public static Singleton3 getInstance(){
        if (SINGLETON_3 == null) {
            SINGLETON_3 = new Singleton3();
        }
        return SINGLETON_3;
    }
}
