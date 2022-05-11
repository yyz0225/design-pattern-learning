package com.yyz.design.pattern.chainofresponsibility;

/**
 * 副校长审批类
 * @Author: yyz
 * @Date: 2022/5/11 12:51
 */
public class ViceSchoolMasterApprover extends AbstractApprover {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() >10000 && purchaseRequest.getPrice() <=30000) {
            System.out.println("请求编号: id="+purchaseRequest.getId()+",被"+this.name+"处理.");
        }else {
            next.processRequest(purchaseRequest);
        }
    }
}
