package com.yyz.design.pattern.memento;

/**
 * 源对象 需要保存状态的对象
 * @Author: yyz
 * @Date: 2022/5/6 11:06
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 将当前对象状态保存到备忘录对象,并返回
     * @return Memento
     */
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    /**
     * 从备忘录对象获取保存的对象状态
     * @param memento 备忘录对象
     */
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
