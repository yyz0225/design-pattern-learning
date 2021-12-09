package com.yyz.design.pattern.build;

/**
 * 抽象建造者
 * @Author: yyz
 * @Date: 2021/12/9 12:42
 */
public abstract class AbstractHouseBuilder {

    /**
     * 组合 房子
     */
    protected House house = new House();

    /**
     * 打地基
     */
    abstract void buildBasic();

    /**
     * 砌墙
     */
    abstract void buildWalls();

    /**
     * 封顶
     */
    abstract void roofed();

    public House buildHouse(){
        return house;
    }
}
