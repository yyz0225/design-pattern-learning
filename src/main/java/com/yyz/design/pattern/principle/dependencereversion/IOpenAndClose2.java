package com.yyz.design.pattern.principle.dependencereversion;

/**
 * 开关接口
 * @Author: yyz
 * @Date: 2021/9/27 16:39
 */
public interface IOpenAndClose2 {
    /**
     * 抽象方法,开关接口
     */
    public void open();

    public void setTv(ITV itv);
}
