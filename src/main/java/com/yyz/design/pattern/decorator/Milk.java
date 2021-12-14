package com.yyz.design.pattern.decorator;

/**
 * 牛奶调味品
 * @Author: yyz
 * @Date: 2021/12/14 12:59
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }
}
