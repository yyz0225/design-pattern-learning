package com.yyz.design.pattern.single;

/**
 * @Author: yyz 枚举类实现单例 推荐使用
 * @Date: 2021/12/7 12:44
 */
public enum Singleton8 {

    /**
     * 一个属性
     */
    SINGLETON_8;

    public void getInstance(){
        System.out.println("ok");
    }
}
