package com.yyz.design.pattern.template;

/**
 * 花生豆浆
 * @Author: yyz
 * @Date: 2021/12/21 12:59
 */
public class PeanutSoyaMilk extends AbstractSoyaMilk {

    @Override
    void addCondiments() {
        System.out.println("加入花生...");
    }
}
