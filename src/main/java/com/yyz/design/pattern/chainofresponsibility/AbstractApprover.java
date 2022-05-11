package com.yyz.design.pattern.chainofresponsibility;

/**
 * 职责链模式 抽象审批者,也是接受者对象
 * @Author: yyz
 * @Date: 2022/5/11 12:41
 */
public abstract class AbstractApprover {

    /**
     * 下一个处理者
     */
    AbstractApprover next;

    String name;

    public AbstractApprover(String name) {
        this.name = name;
    }

    public void setNext(AbstractApprover next) {
        this.next = next;
    }

    /**
     * 处理审批请求方法,得到一个请求,处理是子类完成,故设计成抽象
     * @param purchaseRequest 购买请求
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
