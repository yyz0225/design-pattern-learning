package com.yyz.design.pattern.factory;

/**
 * @Author: yyz
 * @Date: 2021/12/7 14:28
 */
public class CheesePizza extends Pizza {


    public CheesePizza(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "cheese";
    }
}
