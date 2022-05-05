package com.yyz.design.pattern.mediator;

/**
 * 窗帘 同事类型
 * @Author: yyz
 * @Date: 2022/4/15 9:48
 */
public class Curtains extends AbstractColleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        // 构造器初始化时,就将自己添加到中介者集合中
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void upCurtains(){
        System.out.println("I'm holding Up Curtains!");
    }
}
