package com.yyz.design.pattern.mediator;

/**
 * 抽象中介者(调停者)
 * @Author: yyz
 * @Date: 2022/4/15 9:26
 */
public abstract class Mediator {

    /**
     * 将同事类添加到中介者集合中
     * @param colleagueName 同事类名称
     * @param colleague 同事类
     */
    abstract void register(String colleagueName, AbstractColleague colleague);

    /**
     * 接收消息,具体的同事对象发出
     * @param stateChange 状态改变
     * @param colleagueName 同事类名称
     */
    abstract void getMessage(int stateChange, String colleagueName);

    /**
     * 发送消息
     */
    abstract void sendMessage();
}
