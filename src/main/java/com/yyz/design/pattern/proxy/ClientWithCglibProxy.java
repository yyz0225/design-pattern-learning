package com.yyz.design.pattern.proxy;

/**
 * 动态代理 客户端调用类
 * @Author: yyz
 * @Date: 2021/12/17 11:43
 */
public class ClientWithCglibProxy {

    public static void main(String[] args) {
        // 被代理对象
        TeachDaoCglib cglib = new TeachDaoCglib();

        // 代理工厂 需传入被代理对象,工厂里封装了代理的逻辑
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(cglib);
        // 代理对象
        TeachDaoCglib iTeacherDao = (TeachDaoCglib) cglibProxyFactory.getProxyInstance();

        // 执行代理方法
        iTeacherDao.teach();
    }
}
