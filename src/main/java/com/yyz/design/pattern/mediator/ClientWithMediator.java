package com.yyz.design.pattern.mediator;

/**
 * 中介者模式 客户端调用类
 * @Author: yyz
 * @Date: 2022/4/15 9:25
 */
public class ClientWithMediator {

    public static void main(String[] args) {
        // 定义一个中介者对象
        Mediator mediator = new ConcreteMediator();
        // 创建闹钟对象,并添加到中介者对象中
        AlarmColleague alarm = new AlarmColleague(mediator,"Alarm");
        // 创建咖啡机对象,并添加到中介者对象中
        CoffeeMachineColleague coffee = new CoffeeMachineColleague(mediator,"CoffeeMachine");
        // 创建TV对象,并添加到中介者对象中
        TV tv = new TV(mediator,"TV");
        // 创建窗帘对象,并添加到中介者对象中
        Curtains curtains = new Curtains(mediator,"curtains");

        // 完成任务步骤
        alarm.sendAlarm(0);
        coffee.finishCoffee();
        alarm.sendAlarm(1);
    }
}
