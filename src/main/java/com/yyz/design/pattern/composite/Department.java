package com.yyz.design.pattern.composite;

/**
 * 专业 是非叶子节点,没有子节点
 * @Author: yyz
 * @Date: 2021/12/14 15:00
 */
public class Department extends AbstractOrganizationComponent{


    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        System.out.println(getName());

    }
}
