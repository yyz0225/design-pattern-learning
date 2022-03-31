package com.yyz.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器 客户端实例
 * @Author: yyz
 * @Date: 2022/3/31 16:37
 */
public class ClientWithIterator {

    public static void main(String[] args) {

        // 创建学院集合
        List<CollegeAggregate> collegeAggregates = new ArrayList<>();

        // 创建学院
        ComputerCollegeAggregate computerCollegeAggregate = new ComputerCollegeAggregate();
        InfoCollegeAggregate infoCollegeAggregate = new InfoCollegeAggregate();

        collegeAggregates.add(computerCollegeAggregate);
        collegeAggregates.add(infoCollegeAggregate);

        OutPutImpl outPut = new OutPutImpl(collegeAggregates);
        outPut.printCollege();
    }
}
