package com.yyz.design.pattern.principle.dependencereversion;

/**
 * 接口传递
 * @Author: yyz
 * @Date: 2021/9/27 16:43
 */
public class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV itv) {
        itv.play();
    }
}
