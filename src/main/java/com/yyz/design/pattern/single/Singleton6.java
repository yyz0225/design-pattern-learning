package com.yyz.design.pattern.single;

/**
 * 单例模式之懒汉式(线程安全 双重校验锁) 延时加载,效率较高,推荐使用
 * @Author: yyz
 * @Date: 2021/12/7 12:31
 */
public class Singleton6 {

    /**
     * 私有化构造器,阻止外部实例访问
     */
    private Singleton6(){}

    private static volatile Singleton6 SINGLETON_6 = null;


    public static Singleton6 getInstance(){
        if (SINGLETON_6 == null) {
            synchronized (Singleton6.class){
                if (SINGLETON_6 == null) {
                    SINGLETON_6 = new Singleton6();
                }
            }
        }
        return SINGLETON_6;
    }
}
