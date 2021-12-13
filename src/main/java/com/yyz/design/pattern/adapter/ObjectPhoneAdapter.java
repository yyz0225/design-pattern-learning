package com.yyz.design.pattern.adapter;

/**
 * 适配器模式之对象适配器模式
 * @Author: yyz
 * @Date: 2021/12/9 20:16
 */
public class ObjectPhoneAdapter implements IVoltage5V{

    /**
     * 聚合对象
     */
    private Voltage220V output220V;

    /**
     * 构造器方法传入对象依赖
     * @param output220V
     */
    public ObjectPhoneAdapter(Voltage220V output220V) {
        this.output220V = output220V;
    }

    /**
     * setter方法传入对象依赖
     * @param output220V
     */
    public void setOutput220V(Voltage220V output220V) {
        this.output220V = output220V;
    }

    @Override
    public int output5V() {
        int srcV = this.output220V.output220V();
        int destV = srcV / 44;
        return destV;
    }
}
