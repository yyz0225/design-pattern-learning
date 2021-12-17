package com.yyz.design.pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理工厂 封装动态代理方法调用
 *
 * @Author: yyz
 * @Date: 2021/12/17 12:29
 */
public class DynamicProxyFactory {

    /**
     * 被代理对象
     */
    private Object target;

    public DynamicProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("JDK代理开始..");
            // 反射调用目标方法
            Object object = method.invoke(target,args);
            System.out.println("代理提交...");
            return object;
        });
    }

}
