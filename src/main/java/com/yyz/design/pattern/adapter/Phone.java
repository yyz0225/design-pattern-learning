package com.yyz.design.pattern.adapter;

/**
 * 手机
 * @Author: yyz
 * @Date: 2021/12/9 20:12
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压等于5伏,可以充电.....");
        }else if(iVoltage5V.output5V() > 5){
            System.out.println("电压大于5伏,不可以充电.....");
        }
    }
}
