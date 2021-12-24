package com.yyz.design.pattern.proxy;

import java.lang.reflect.Method;

/**
 * Cglib动态代理工厂类
 * @Author: yyz
 * @Date: 2021/12/17 12:57
 */
public class CglibProxyFactory /*implements MethodInterceptor*/{

    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 返回一个代理对象,是target对象的代理对象
     * @return
     */
    public Object getProxyInstance(){
        /*// 1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类
        enhancer.setSuperClass(target.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类对象,即代理对象
        return enhancer.create();*/
        return "hello";
    }

    /**
     * 重写intercept方法,会调用目标对象的方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    //@Override
    public Object intercept(Object proxy, Method method, Object[] args/*, MethodProxy arg3*/)throws Throwable{
        System.out.println("Cglib代理开始..");
        // 反射调用目标方法
        Object object = method.invoke(target,args);
        System.out.println("Cglib代理提交...");
        return object;
    }

}
