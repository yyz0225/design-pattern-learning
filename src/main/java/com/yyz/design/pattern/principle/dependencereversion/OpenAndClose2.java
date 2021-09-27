package com.yyz.design.pattern.principle.dependencereversion;

/**
 * setter方法传递
 * @Author: yyz
 * @Date: 2021/9/27 16:43
 */
public class OpenAndClose2 implements IOpenAndClose2{

    private ITV itv;

    @Override
    public void open() {
        this.itv.play();
    }

    @Override
    public void setTv(ITV itv) {
        this.itv = itv;
    }
}
