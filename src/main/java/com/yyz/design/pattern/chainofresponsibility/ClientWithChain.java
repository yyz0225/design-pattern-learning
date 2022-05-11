package com.yyz.design.pattern.chainofresponsibility;

/**
 * 责任链模式 测试类
 * @Author: yyz
 * @Date: 2022/5/11 13:37
 */
public class ClientWithChain {

    public static void main(String[] args) {
        // 创建请求对象
        PurchaseRequest request = new PurchaseRequest(1,31000,1);

        // 创建各个审批对象
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        ColleagueApprover colleagueApprover = new ColleagueApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("赵副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("王校长");

        // 将各个审批对象链接起来,构成责任链(环形)
        departmentApprover.setNext(colleagueApprover);
        colleagueApprover.setNext(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setNext(schoolMasterApprover);
        schoolMasterApprover.setNext(departmentApprover);

        // 处理审批请求
        departmentApprover.processRequest(request);
        schoolMasterApprover.processRequest(request);

    }
}
