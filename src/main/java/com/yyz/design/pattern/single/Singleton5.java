package com.yyz.design.pattern.single;

/**
 * 单例模式之懒汉式(线程安全 同步代码块)
 * @Author: yyz
 * @Date: 2021/12/7 12:31
 */
public class Singleton5 {

    /**
     * 私有化构造器,阻止外部实例访问
     */
    private Singleton5(){}

    private static Singleton5 SINGLETON_5 = null;


    public static Singleton5 getInstance(){
        if (SINGLETON_5 == null) {
            synchronized (Singleton5.class){
                SINGLETON_5 = new Singleton5();
            }
        }
        return SINGLETON_5;
    }
}
