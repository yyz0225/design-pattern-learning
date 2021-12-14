package com.yyz.design.pattern.decorator;

/**
 * 巧克力调味品
 * @Author: yyz
 * @Date: 2021/12/14 12:59
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDes(" 巧克力 ");
        setPrice(3.0f);
    }
}
