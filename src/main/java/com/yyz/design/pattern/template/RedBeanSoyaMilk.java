package com.yyz.design.pattern.template;

/**
 * 红豆豆浆
 * @Author: yyz
 * @Date: 2021/12/21 12:59
 */
public class RedBeanSoyaMilk extends AbstractSoyaMilk {


    @Override
    void addCondiments() {
        System.out.println("加入红豆...");
    }
}
