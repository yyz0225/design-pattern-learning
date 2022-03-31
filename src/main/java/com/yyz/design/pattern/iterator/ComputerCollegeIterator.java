package com.yyz.design.pattern.iterator;

import java.util.Iterator;

/**
 * 计算机学院迭代器
 * @Author: yyz
 * @Date: 2022/3/31 15:31
 */
public class ComputerCollegeIterator implements Iterator {

    /**
     * 迭代器内部需要知道Department以什么形式存放的  => 数组
     */
    private Department[] departments;

    /**
     * 遍历的位置
     */
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    /**
     * 删除方法.默认空实现
     */
    @Override
    public void remove() {

    }
}
