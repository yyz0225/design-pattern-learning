package com.yyz.design.pattern.memento;

/**
 * 备忘录对象 保存对象的状态
 * @Author: yyz
 * @Date: 2022/5/6 11:05
 */
public class Memento {

    private String state;

    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
