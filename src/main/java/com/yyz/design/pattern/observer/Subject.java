package com.yyz.design.pattern.observer;

/**
 * 主题接口 用于登记注册,移除和通知推送观察者
 * @Author: yyz
 * @Date: 2022/4/14 10:30
 */
public interface Subject {

    /**
     * 登记注册观察者
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知推送所有观察者
     */
    void notifyAllObserver();
}
