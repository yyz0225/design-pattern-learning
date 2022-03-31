package com.yyz.design.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: yyz
 * @Date: 2022/3/31 16:11
 */
public class OutPutImpl {

    /**
     * 学院集合
     */
    List<CollegeAggregate> collegeAggregates;

    public OutPutImpl(List<CollegeAggregate> collegeAggregates) {
        this.collegeAggregates = collegeAggregates;
    }


    /**
     * 遍历所有学院,然后调用printDepartment输出各个学院信息
     */
    public void printCollege() {
        Iterator<CollegeAggregate> iterator = collegeAggregates.iterator();
        while (iterator.hasNext()) {
            CollegeAggregate collegeAggregate = iterator.next();
            System.out.println("=========="+collegeAggregate.getName()+"==============");
            printDepartment(collegeAggregate.createIterator());
        }
    }

    /**
     * 输出各个学院信息
     * @param iterator 具体的迭代器
     */
    private void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department)iterator.next();
            System.out.println(department.getName());
        }
    }

}
