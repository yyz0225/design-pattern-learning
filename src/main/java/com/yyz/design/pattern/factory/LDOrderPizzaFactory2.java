package com.yyz.design.pattern.factory;

/**
 * 伦敦披萨生产工厂类
 * @Author: yyz
 * @Date: 2021/12/8 11:44
 */
public class LDOrderPizzaFactory2 implements IOrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza  = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza("伦敦奶酪披萨");
        }else if("pepper".equals(orderType)){
            pizza = new LDPepperPizza("伦敦胡椒披萨");
        }
        return pizza;
    }
}
