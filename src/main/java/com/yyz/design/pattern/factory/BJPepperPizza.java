package com.yyz.design.pattern.factory;

/**
 * @Author: yyz
 * @Date: 2021/12/7 14:38
 */
public class BJPepperPizza extends Pizza{

    public BJPepperPizza(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "pepper";
    }
}
