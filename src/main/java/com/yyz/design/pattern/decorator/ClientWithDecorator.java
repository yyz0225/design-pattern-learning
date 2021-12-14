package com.yyz.design.pattern.decorator;

/**
 * 装饰者模式客户端调用类
 * @Author: yyz
 * @Date: 2021/12/14 13:47
 */
public class ClientWithDecorator {

    public static void main(String[] args) {

        // 点一杯无因咖啡
        Drink drink = new DeCaf();
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

        // 加豆浆
        drink = new Soy(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

        // 加牛奶

        drink = new Milk(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());
    }
}
