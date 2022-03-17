package com.yyz.design.pattern.build;

/**
 * 普通房子构建器
 * @Author: yyz
 * @Date: 2021/12/9 12:47
 */
public class CommonHouseBuilder extends AbstractHouseBuilder {

    @Override
    void buildBasic() {
        System.out.println("普通房子地基打10米");
        house.setBasic("10");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙3米");
        house.setWalls("3");
    }

    @Override
    void roofed() {
        System.out.println("普通房子的屋顶");
        house.setRoofed("普通房子的屋顶");
    }
}
