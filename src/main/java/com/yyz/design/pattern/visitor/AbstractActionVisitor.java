package com.yyz.design.pattern.visitor;

/**
 * 得到不同的测评结构 抽象访问者
 * @Author: yyz
 * @Date: 2022/3/30 16:29
 */
public abstract class AbstractActionVisitor {

    /**
     * 获取男性评价结果
     * @param man 男性
     */
    public abstract void getManResult(Man man);

    /**
     * 获取女性评价结果
     * @param woman 女性
     */
    public abstract void getWomanResult(Woman woman);
}
