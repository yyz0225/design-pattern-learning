package com.yyz.design.pattern.proxy;

/**
 * 老师授课类
 * @Author: yyz
 * @Date: 2021/12/17 11:36
 */
public class TeachDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师授课...");
    }
}
