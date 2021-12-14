package com.yyz.design.pattern.decorator;

/**
 * 装饰者
 * @Author: yyz
 * @Date: 2021/12/14 12:54
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // getPrice 自己价格加上饮品价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        // drink.getDes()输出被装饰者信息
        return des+" "+getPrice() +" && "+ drink.getDes();
    }
}
