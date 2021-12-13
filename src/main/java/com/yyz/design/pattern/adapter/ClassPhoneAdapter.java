package com.yyz.design.pattern.adapter;

/**
 * 适配器模式之类的适配器模式
 * @Author: yyz
 * @Date: 2021/12/9 20:16
 */
public class ClassPhoneAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5V() {
        int srcV = output220V();
        int destV = srcV / 44;
        return destV;
    }
}
