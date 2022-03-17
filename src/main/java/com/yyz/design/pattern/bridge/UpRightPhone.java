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
        System.out.println(" 直立式手机...");
        super.open();
    }

    @Override
    public void close(){
        System.out.println(" 直立式手机...");
        super.close();
    }

    @Override
    public void call(){
        System.out.println(" 直立式手机...");
        super.call();
    }

}
