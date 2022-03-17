package com.yyz.design.pattern.factory;

/**
 * 抽象工厂模式 客户端测试类
 * @Author: yyz
 * @Date: 2022/2/16 14:16
 */
public class ClientWithAbstractFactory {

    public static void main(String[] args) {
        OrderPizzaWithAbstractFactory factory = new OrderPizzaWithAbstractFactory(new LDOrderPizzaFactory2());

    }
}
