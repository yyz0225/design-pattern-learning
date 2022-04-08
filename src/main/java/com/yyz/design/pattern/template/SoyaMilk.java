package com.yyz.design.pattern.template;

/**
 * 纯豆浆
 * @Author: yyz
 * @Date: 2022/4/8 9:51
 */
public class SoyaMilk extends AbstractSoyaMilk{

    @Override
    void addCondiments() {
        System.out.println("纯豆浆不需要添加配料...");
    }

    @Override
    boolean customerWantCondiments(){
        return false;
    }

}
