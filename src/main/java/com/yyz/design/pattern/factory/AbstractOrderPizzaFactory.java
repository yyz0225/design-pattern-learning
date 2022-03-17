package com.yyz.design.pattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 抽象订单披萨类 工厂方法模式
 * @Author: yyz
 * @Date: 2021/12/7 14:31
 */
public abstract class AbstractOrderPizzaFactory {

    /**
     * 创建披萨的行为交给子类去实现
     * @param orderType 下单类型
     * @return
     */
    abstract Pizza createPizza(String orderType);

    public AbstractOrderPizzaFactory(){
        Pizza pizza = null;
        String orderType;
        do{
            orderType = getType();
            pizza = createPizza(orderType);
            System.out.println(pizza.getName());
            // 输出披萨制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);

    }

    /**
     * 从控制台获取披萨订购种类
     * @return
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
