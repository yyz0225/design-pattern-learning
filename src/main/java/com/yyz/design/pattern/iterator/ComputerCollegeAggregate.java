package com.yyz.design.pattern.iterator;

import java.util.Iterator;

/**
 * 计算机学院具体聚合对象 以数组方式组装的对象
 * @Author: yyz
 * @Date: 2022/3/31 15:41
 */
public class ComputerCollegeAggregate implements CollegeAggregate {

    private Department[] departments;

    /**
     * 保存当前数组对象个数
     */
    private int numOfDepartment = 0;

    public ComputerCollegeAggregate() {
        departments = new Department[5];
        addDepartment("java专业","java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
