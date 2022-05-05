package com.yyz.design.pattern.mediator;

import java.util.HashMap;

/**
 * @Author: yyz
 * @Date: 2022/5/5 12:42
 */
public class ConcreteMediator  extends Mediator{

    // 同事对象map
    private HashMap<String,AbstractColleague> colleagueHashMap;
    // 同事对象map value是同事对象名称
    private HashMap<String,String> interMap;

    public ConcreteMediator() {
        colleagueHashMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    void register(String colleagueName, AbstractColleague colleague) {
        colleagueHashMap.put(colleagueName,colleague);

        if (colleague instanceof AlarmColleague) {
            interMap.put("Alarm",colleagueName);
        }else if(colleague instanceof CoffeeMachineColleague){
            interMap.put("CoffeeMachine",colleagueName);
        }
    }


    // 具体中介者核心方法
    // 1.根据得到消息,完成响应任务
    // 2.中介者在这个方法,协调各个具体的同事对象,完成任务
    @Override
    void getMessage(int stateChange, String colleagueName) {
        if (colleagueHashMap.get(colleagueName) instanceof AlarmColleague) {
            if (stateChange == 0) {
                ((CoffeeMachineColleague)colleagueHashMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((TV)colleagueHashMap.get(interMap.get("TV"))).startTV();
            }else if(stateChange ==1){
                ((TV)colleagueHashMap.get(interMap.get("TV"))).stopTV();
            }
        }else if(colleagueHashMap.get(colleagueName) instanceof CoffeeMachineColleague){
            ((Curtains)colleagueHashMap.get(interMap.get("Curtains"))).upCurtains();

        }else if(colleagueHashMap.get(colleagueName) instanceof TV){
            // 如果TV发现消息,在这里处理

        }else if(colleagueHashMap.get(colleagueName) instanceof Curtains){
            // 如果窗帘发现消息,在这里处理
        }
    }

    @Override
    void sendMessage() {

    }
}
