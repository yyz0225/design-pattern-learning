package com.yyz.design.pattern.proxy;

/**
 * 静态代理类
 * 优点: 动态的扩展目标功能
 * 缺点: 代理对象需要实现和被代理对象一样的接口,代理类太多; 接口一旦增加方法,被代理对象和代理对象都需要维护
 * @Author: yyz
 * @Date: 2021/12/17 11:38
 */
public class TeacherDaoStaticProxy implements ITeacherDao {

    private ITeacherDao iTeacherDao;

    public TeacherDaoStaticProxy(ITeacherDao iTeacherDao) {
        // 聚合的方式,就是装饰器模式
        this.iTeacherDao = iTeacherDao;
    }


    public TeacherDaoStaticProxy() {
        // 代理对象中直接创建被代理对象的实例,采用的是组合的方式.就是静态代理模式
        this.iTeacherDao = new TeachDao();
    }

    @Override
    public void teach() {
        System.out.println("开始代理,执行某些操作...");
        iTeacherDao.teach();
        System.out.println("提交方法....");
    }
}

