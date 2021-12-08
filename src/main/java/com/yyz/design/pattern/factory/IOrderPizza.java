package com.yyz.design.pattern.factory;

/**
 * 工厂模式之抽象工厂模式(定义一个工厂接口,供子类实现即可)
 * @Author: yyz
 * @Date: 2021/12/8 12:41
 */
public interface IOrderPizza {

    /**
     * 披萨生产方法
     * @param oderType 披萨类型
     * @return
     */
    Pizza createPizza(String oderType);
}
