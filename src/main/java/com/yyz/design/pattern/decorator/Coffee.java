package com.yyz.design.pattern.decorator;

/**
 * 咖啡饮品类
 * @Author: yyz
 * @Date: 2021/12/14 12:45
 */
public class Coffee extends Drink {


    @Override
    public float cost() {
        return super.getPrice();
    }
}
