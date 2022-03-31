package com.yyz.design.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 信息学院迭代器
 * @Author: yyz
 * @Date: 2022/3/31 15:31
 */
public class InfoCollegeIterator implements Iterator {

    private List<Department> departmentList;

    /**
     * 无效索引
     */
    int index = -1 ;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index>= departmentList.size()-1){
            return false;
        }else {
            index +=1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    /**
     * 删除方法,默认空实现
     */
    @Override
    public void remove() {

    }
}
