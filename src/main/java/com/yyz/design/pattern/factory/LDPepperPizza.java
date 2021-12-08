package com.yyz.design.pattern.factory;

/**
 * @Author: yyz
 * @Date: 2021/12/7 14:38
 */
public class LDPepperPizza extends Pizza{

    public LDPepperPizza(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "pepper";
    }
}
