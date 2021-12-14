package com.yyz.design.pattern.bridge;

/**
 * 直立式手机样式
 * @Author: yyz
 * @Date: 2021/12/13 17:27
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(IBrand iBrand) {
        super(iBrand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println(" 直立式手机...");
    }

    @Override
    public void close(){
        super.close();
        System.out.println(" 直立式手机...");
    }

    @Override
    public void call(){
        super.call();
        System.out.println(" 直立式手机...");
    }

}
