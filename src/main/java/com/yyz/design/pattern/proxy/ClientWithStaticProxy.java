package com.yyz.design.pattern.proxy;

/**
 * 静态代理 客户端调用类
 * @Author: yyz
 * @Date: 2021/12/17 11:43
 */
public class ClientWithStaticProxy {

    public static void main(String[] args) {
        // 被代理对象
        TeachDao teachDao = new TeachDao();

        // 代理对象
        TeacherDaoStaticProxy proxy = new TeacherDaoStaticProxy(teachDao);

        // 执行代理方法
        proxy.teach();
    }
}
