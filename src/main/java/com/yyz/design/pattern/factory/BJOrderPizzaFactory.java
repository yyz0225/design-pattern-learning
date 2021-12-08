package com.yyz.design.pattern.factory;

/**
 * 伦敦披萨生产工厂类
 * @Author: yyz
 * @Date: 2021/12/8 11:44
 */
public class BJOrderPizzaFactory extends AbstractOrderPizzaFactory {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza  = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza("北京奶酪披萨");
        }else if("pepper".equals(orderType)){
            pizza = new BJPepperPizza("北京胡椒披萨");
        }
        return pizza;
    }
}
