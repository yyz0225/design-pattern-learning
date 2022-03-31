package com.yyz.design.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 信息工程学院具体聚合对象 以list方式组装的对象
 * @Author: yyz
 * @Date: 2022/3/31 15:41
 */
public class InfoCollegeAggregate implements CollegeAggregate {

    private List<Department> departmentList;

    public InfoCollegeAggregate() {
        departmentList = new ArrayList<>();
        addDepartment("java专业","java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
