package com.yyz.design.pattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 传统订单披萨类
 * @Author: yyz
 * @Date: 2021/12/7 14:31
 */
public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do{
            orderType = getType();
            if("china".equals(orderType)){
                pizza = new ChinaPizza("中式风味披萨");
            }else if("cheess".equals(orderType)){
                pizza = new CheesePizza("奶酪披萨");
            }else if("greek".equals(orderType)){
                pizza = new GreekPizza("希腊披萨");
            }else if("pepper".equals(orderType)){
                pizza = new PepperPizza("胡椒味披萨");
            }
            System.out.println(pizza.getName());

            // 输出披萨制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);

    }

    /**
     * 从控制台获取披萨订购种类
     * @return
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
