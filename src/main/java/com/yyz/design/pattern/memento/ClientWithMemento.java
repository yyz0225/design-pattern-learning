package com.yyz.design.pattern.memento;

/**
 * 备忘录模式 客户端调用测试类
 * @Author: yyz
 * @Date: 2022/5/6 11:18
 */
public class ClientWithMemento {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("状态1 攻击力100");
        careTaker.add(originator.saveStateMemento());

        originator.setState("状态2 攻击力80");
        careTaker.add(originator.saveStateMemento());

        originator.setState("状态3 攻击力50");
        careTaker.add(originator.saveStateMemento());

        System.out.println("当前状态:"+originator.getState());
        System.out.println("==========恢复到状态1=====");
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("当前状态:"+originator.getState());

        System.out.println("==========多个状态的备忘录对象========");
        GameRoleOriginator gameRoleOriginator = new GameRoleOriginator();
        GameRoleCareTaker gameRoleCareTaker = new GameRoleCareTaker();
        gameRoleOriginator.setVif("100");
        gameRoleOriginator.setDef("100");
        gameRoleOriginator.display();
        // 保存当前状态 只保存一次
        gameRoleCareTaker.setMemento(gameRoleOriginator.createMemento());
        System.out.println("========打boss========");
        // 防御力和攻击力均下降到40了
        gameRoleOriginator.setVif("40");
        gameRoleOriginator.setDef("40");
        gameRoleOriginator.display();
        // 角色状态恢复到初始数据
        gameRoleOriginator.getStateFromMemento(gameRoleCareTaker.getMemento());
        gameRoleOriginator.display();
    }
}
