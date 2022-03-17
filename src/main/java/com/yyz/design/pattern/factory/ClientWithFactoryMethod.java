package com.yyz.design.pattern.factory;

/**
 * 工厂方法模式 客户端测试类
 * @Author: yyz
 * @Date: 2022/2/16 14:16
 */
public class ClientWithFactoryMethod {

    public static void main(String[] args) {
        AbstractOrderPizzaFactory factory = new BJOrderPizzaFactory();

    }
}
