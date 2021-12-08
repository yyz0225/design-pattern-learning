package com.yyz.design.pattern.factory;

/**
 * 工厂模式之简单工厂模式
 *
 * @Author: yyz
 * @Date: 2021/12/7 14:18
 */
public class SimpleFactory {


    /**
     * 实例形式
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if ("china".equals(orderType)) {
            pizza = new ChinaPizza("中式风味披萨");
        } else if ("cheess".equals(orderType)) {
            pizza = new CheesePizza("奶酪披萨");
        } else if ("greek".equals(orderType)) {
            pizza = new GreekPizza("希腊披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza("胡椒味披萨");
        }
        return pizza;
    }


    /**
     * 静态方法模式
     * @param orderType
     * @return
     */
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;

        if ("china".equals(orderType)) {
            pizza = new ChinaPizza("中式风味披萨");
        } else if ("cheess".equals(orderType)) {
            pizza = new CheesePizza("奶酪披萨");
        } else if ("greek".equals(orderType)) {
            pizza = new GreekPizza("希腊披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza("胡椒味披萨");
        }
        return pizza;
    }

}
