package com.yyz.design.pattern.adapter;

/**
 * 被适配者 220v交流电
 * @Author: yyz
 * @Date: 2021/12/9 20:13
 */
public class Voltage220V {

    public int output220V(){
        int src = 220;
        System.out.println("电压="+src+"伏");
        return src;
    }
}
