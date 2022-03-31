package com.yyz.design.pattern.iterator;

import java.util.Iterator;

/**
 * 学院聚合接口
 * @Author: yyz
 * @Date: 2022/3/31 15:34
 */
public interface CollegeAggregate {

    /**
     * 获取名称
     * @return String
     */
    String getName();

    /**
     * 增加系方法
     * @param name 名称
     * @param desc 描述
     */
    void addDepartment(String name,String desc);

    /**
     * 创建一个迭代器
     * @return Iterator
     */
    Iterator createIterator();
}
