package com.yyz.design.pattern.flyweight;

/**
 * 网站抽象类 享元角色
 * @Author: yyz
 * @Date: 2021/12/16 12:29
 */
public abstract class Website {
    /**
     * 抽象方法
     * @param user
     */
    public abstract void use(User user);
}
