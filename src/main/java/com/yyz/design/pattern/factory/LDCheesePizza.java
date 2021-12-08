package com.yyz.design.pattern.factory;

/**
 * @Author: yyz
 * @Date: 2021/12/7 14:28
 */
public class LDCheesePizza extends Pizza {


    public LDCheesePizza(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "cheese";
    }
}
