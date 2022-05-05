package com.yyz.design.pattern.mediator;

/**
 * 闹钟 同事类
 * @Author: yyz
 * @Date: 2022/5/5 12:32
 */
public class AlarmColleague extends AbstractColleague{

    public AlarmColleague(Mediator mediator, String name) {
        super(mediator, name);
        // 在创建同事对象时,将自己添加到中介者对象集合中
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        // 调用中介者对象的getMessage
        this.getMediator().getMessage(stateChange,this.name);

    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }
}
