package com.yyz.design.pattern.visitor;

/**
 * 失败 具体访问者
 * @Author: yyz
 * @Date: 2022/3/30 16:44
 */
public class FailVisitor extends AbstractActionVisitor {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给该歌手的评价很失败!");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给该歌手的评价很失败!");
    }
}
