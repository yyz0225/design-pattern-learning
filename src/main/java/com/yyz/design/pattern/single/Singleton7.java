package com.yyz.design.pattern.single;

/**
 * 单例模式之懒汉式(线程安全 静态内部类) 延时加载,效率高,推荐使用
 * @Author: yyz
 * @Date: 2021/12/7 12:31
 */
public class Singleton7 {

    /**
     * 私有化构造器,阻止外部实例访问
     */
    private Singleton7(){}



    public static synchronized Singleton7 getInstance(){
        return SingletonStatic.SINGLETON_7;
    }

    private static class SingletonStatic{
        private static final Singleton7 SINGLETON_7 = new Singleton7();
    }
}
