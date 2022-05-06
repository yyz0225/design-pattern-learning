package com.yyz.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 守护者对象 负责保存多个备忘录对象和获取某个备忘录对象
 * @Author: yyz
 * @Date: 2022/5/6 11:13
 */
public class GameRoleCareTaker {

    private GameRoleMemento memento;

    /**
     * 备忘录对象集合,如果需要保存不同备忘录对象,在不同时间点的状态,可使用HashMap<String,集合>
     */
    private List<GameRoleMemento> mementos = new ArrayList<>();

    public void add(GameRoleMemento memento){
        mementos.add(memento);
    }

    public GameRoleMemento get(int index){
        return mementos.get(index);
    }

    public void remove(int index){
        mementos.remove(index);
    }

    public GameRoleMemento getMemento() {
        return memento;
    }

    public void setMemento(GameRoleMemento memento) {
        this.memento = memento;
    }
}
