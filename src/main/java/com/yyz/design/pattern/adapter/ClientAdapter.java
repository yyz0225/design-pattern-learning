package com.yyz.design.pattern.adapter;

/**
 * @Author: yyz
 * @Date: 2021/12/9 20:23
 */
public class ClientAdapter {

    public static void main(String[] args) {
        Phone phone = new Phone();
        // 类的适配器模式
        phone.charging(new ClassPhoneAdapter());

        //对象的适配器模式
        phone.charging(new ObjectPhoneAdapter(new Voltage220V()));

        //接口的适配器模式
        InterfaceAdapter interfaceAdapter = new InterfaceAdapter();
        interfaceAdapter.m1();
    }
}
