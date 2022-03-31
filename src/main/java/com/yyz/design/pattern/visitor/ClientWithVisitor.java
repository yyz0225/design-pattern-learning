package com.yyz.design.pattern.visitor;

/**
 * 访问者模式客户端调用
 * @Author: yyz
 * @Date: 2022/3/30 17:05
 */
public class ClientWithVisitor {

    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        SuccessVisitor successVisitor = new SuccessVisitor();
        objectStructure.display(successVisitor);

        System.out.println("========================");
        WaitVisitor waitVisitor = new WaitVisitor();
        objectStructure.display(waitVisitor);
    }
}
