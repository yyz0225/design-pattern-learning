package com.yyz.design.pattern.visitor;

/**
 * 具体被访问者
 * @Author: yyz
 * @Date: 2022/3/30 16:41
 */
public class Woman extends AbstractPerson {

    @Override
    public void accept(AbstractActionVisitor visitor) {
        visitor.getWomanResult(this);
    }
}
