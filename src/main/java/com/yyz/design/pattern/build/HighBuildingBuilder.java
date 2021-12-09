package com.yyz.design.pattern.build;

/**
 * 高楼构建器
 * @Author: yyz
 * @Date: 2021/12/9 12:47
 */
public class HighBuildingBuilder extends AbstractHouseBuilder {

    @Override
    void buildBasic() {
        System.out.println("高楼地基打100米");

    }

    @Override
    void buildWalls() {
        System.out.println("高楼砌墙100米");

    }

    @Override
    void roofed() {
        System.out.println("高楼的透明屋顶");

    }
}
