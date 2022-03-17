package com.yyz.design.pattern.factory;

/**
 * 简单工厂模式 客户端测试类
 * @Author: yyz
 * @Date: 2022/2/16 14:16
 */
public class ClientWithSimpleFactory {

    public static void main(String[] args) {
        OrderPizzaWithSimpleFactory factory = new OrderPizzaWithSimpleFactory(new SimpleFactory());
    }
}
