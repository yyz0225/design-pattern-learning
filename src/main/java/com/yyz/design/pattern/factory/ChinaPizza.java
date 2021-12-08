package com.yyz.design.pattern.factory;

/**
 * @Author: yyz
 * @Date: 2021/12/7 14:28
 */
public class ChinaPizza extends Pizza {


    public ChinaPizza(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "china";
    }
}
