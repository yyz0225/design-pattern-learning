package com.yyz.design.pattern.decorator;

/**
 * 豆浆调味品
 * @Author: yyz
 * @Date: 2021/12/14 12:59
 */
public class Soy extends Decorator {

    public Soy(Drink drink) {
        super(drink);
        setDes(" 豆浆 ");
        setPrice(1.5f);
    }
}
