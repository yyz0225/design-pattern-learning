package com.yyz.design.pattern.chainofresponsibility;

/**
 * 教学主任审批类
 * @Author: yyz
 * @Date: 2022/5/11 12:51
 */
public class DepartmentApprover extends AbstractApprover {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <=5000) {
            System.out.println("请求编号: id="+purchaseRequest.getId()+",被"+this.name+"处理.");
        }else {
            next.processRequest(purchaseRequest);
        }
    }
}
