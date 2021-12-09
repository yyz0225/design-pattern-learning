package com.yyz.design.pattern.build;

/**
 * 指挥者,负责整个房屋的构建流程串联
 * @Author: yyz
 * @Date: 2021/12/9 12:53
 */
public class HouseDirector {

    AbstractHouseBuilder abstractHouseBuilder;

    /**
     * 构造者依赖传递方式之一构造器
     * @param abstractHouseBuilder
     */
    public HouseDirector(AbstractHouseBuilder abstractHouseBuilder) {
        this.abstractHouseBuilder = abstractHouseBuilder;
    }

    /**
     * 构造者依赖传递方式之二setter方法
     * @param abstractHouseBuilder
     */
    public void setAbstractHouseBuilder(AbstractHouseBuilder abstractHouseBuilder) {
        this.abstractHouseBuilder = abstractHouseBuilder;
    }

    /**
     * 如何处理建造房子的流程,交给指挥者去处理
     * @return
     */
    public House constructHouse(){
        abstractHouseBuilder.buildBasic();
        abstractHouseBuilder.buildWalls();
        abstractHouseBuilder.roofed();
        return abstractHouseBuilder.buildHouse();
    }
}
