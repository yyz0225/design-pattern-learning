package com.yyz.design.pattern.bridge;

/**
 * 手机品牌接口
 * @Author: yyz
 * @Date: 2021/12/13 17:08
 */
public interface IBrand {

    /**
     * 开机
     */
    void open();

    /**
     * 关机
     */
    void close();

    /**
     * 打电话
     */
    void call();
}
