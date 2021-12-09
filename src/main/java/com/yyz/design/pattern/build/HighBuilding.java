package com.yyz.design.pattern.build;

/** 高楼
 * @Author: yyz
 * @Date: 2021/12/9 12:22
 */
public class HighBuilding extends AbstractHouse {
    
    @Override
    void buildBasics() {
        System.out.println("高楼打地基....");

    }

    @Override
    void buildWalls() {
        System.out.println("高楼砌墙....");

    }

    @Override
    void roofed() {
        System.out.println("高楼封顶....");

    }
}
