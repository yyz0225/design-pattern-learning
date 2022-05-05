package com.yyz.design.pattern.mediator;

/**
 * @Author: yyz
 * @Date: 2022/4/15 9:48
 */
public class TV extends AbstractColleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        // 构造器初始化时,就将自己添加到中介者集合中
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void startTV(){
        System.out.println("====startTV=====");
    }

    public void stopTV(){
        System.out.println("====stopTV=====");
    }
}
