package com.yyz.design.pattern.build;

/**
 * 普通房屋
 * @Author: yyz
 * @Date: 2021/12/9 12:22
 */
public class CommonHouse extends AbstractHouse {

    @Override
    void buildBasics() {
        System.out.println("普通房屋打地基....");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房屋砌墙....");

    }

    @Override
    void roofed() {
        System.out.println("普通房屋封顶....");

    }
}
