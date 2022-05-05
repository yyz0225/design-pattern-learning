package com.yyz.design.pattern.mediator;

/**
 * 咖啡机 同事类
 * @Author: yyz
 * @Date: 2022/5/5 12:32
 */
public class CoffeeMachineColleague extends AbstractColleague{

    public CoffeeMachineColleague(Mediator mediator, String name) {
        super(mediator, name);
        // 在创建同事对象时,将自己添加到中介者对象集合中
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        // 调用中介者对象的getMessage
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void finishCoffee(){
        System.out.println("After five minutes!");
        System.out.println("Coffee is OK!");
        sendMessage(0);
    }

    public void startCoffee(){
        System.out.println("It's time to start coffee!");
    }

}
