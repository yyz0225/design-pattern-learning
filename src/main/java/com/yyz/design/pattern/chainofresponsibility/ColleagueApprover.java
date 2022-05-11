package com.yyz.design.pattern.chainofresponsibility;

/**
 * 院长审批类
 * @Author: yyz
 * @Date: 2022/5/11 12:51
 */
public class ColleagueApprover extends AbstractApprover {

    public ColleagueApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() >5000 && purchaseRequest.getPrice()<=10000) {
            System.out.println("请求编号: id="+purchaseRequest.getId()+",被"+this.name+"处理.");
        }else {
            next.processRequest(purchaseRequest);
        }
    }
}
