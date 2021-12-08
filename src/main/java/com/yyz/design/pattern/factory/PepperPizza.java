package com.yyz.design.pattern.factory;

/**
 * @Author: yyz
 * @Date: 2021/12/7 14:38
 */
public class PepperPizza extends Pizza{

    public PepperPizza(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "pepper";
    }
}
