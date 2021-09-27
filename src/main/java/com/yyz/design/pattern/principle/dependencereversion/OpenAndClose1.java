package com.yyz.design.pattern.principle.dependencereversion;

/**
 * 构造方法传递
 * @Author: yyz
 * @Date: 2021/9/27 16:43
 */
public class OpenAndClose1 implements IOpenAndClose1{

    private ITV itv;

    public OpenAndClose1(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        this.itv.play();
    }
}
