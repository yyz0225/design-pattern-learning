package com.yyz.design.pattern.visitor;

/**
 * 高层接口 对象结构中的元素接口
 * @Author: yyz
 * @Date: 2022/3/30 16:35
 */
public abstract class AbstractPerson {


    /**
     * 提供一个访问者可以访问的方法
     * @param visitor 访问者
     */
    public abstract void accept(AbstractActionVisitor visitor);
}
