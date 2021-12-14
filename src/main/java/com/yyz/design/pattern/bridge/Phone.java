package com.yyz.design.pattern.bridge;

/**
 * 手机样式定义抽象类 桥接类
 * @Author: yyz
 * @Date: 2021/12/13 17:15
 */
public abstract class Phone {

    private IBrand iBrand;

    public Phone(IBrand iBrand) {
        super();
        this.iBrand = iBrand;
    }


    /**
     * 开机
     */
    protected void open(){
        this.iBrand.open();
    }

    /**
     * 关机
     */
    protected void close(){
        this.iBrand.close();
    }

    /**
     * 打电话
     */
    protected void call(){
        this.iBrand.call();
    }

}
