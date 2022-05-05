package com.yyz.design.pattern.mediator;

/**
 * 抽象同事类
 * @Author: yyz
 * @Date: 2022/4/15 9:26
 */
public abstract class AbstractColleague {

    private Mediator mediator;

    public String name;

    public AbstractColleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    /**
     * 每个同事类自己定义自己的行为
     * @param stateChange 状态改变
     */
    public abstract void sendMessage(int stateChange);

    /**
     * 获取中介者
     * @return Mediator
     */
    public Mediator getMediator() {
        return this.mediator;
    }
}
