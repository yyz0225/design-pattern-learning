package com.yyz.design.pattern.template;

/**
 * 模板方法模式的客户端调用
 * @Author: yyz
 * @Date: 2021/12/21 14:33
 */
public class ClientWithTemplateMethod {

    public static void main(String[] args) {
        // 制作红豆豆浆
        AbstractSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        // 制作花生豆浆
        AbstractSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

    }
}
