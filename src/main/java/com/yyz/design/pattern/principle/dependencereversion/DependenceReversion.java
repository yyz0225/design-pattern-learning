package com.yyz.design.pattern.principle.dependencereversion;

/**
 * 违背了依赖倒置(反转)原则
 * 如果要新增微信,支付宝什么之类的消息,需要新增类和方法
 * @Author: yyz
 * @Date: 2021/9/27 16:18
 */
public class DependenceReversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        //person.receiveWeChat(new WeChat()); ....

        //优化
        Person1 person1 = new Person1();
        person1.receive(new Email1());
        person1.receive(new WeChat());
    }
}
