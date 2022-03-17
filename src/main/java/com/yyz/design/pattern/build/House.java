package com.yyz.design.pattern.build;

/**
 * 产品 -> product
 * 房子
 * @Author: yyz
 * @Date: 2021/12/9 12:40
 */
public class House {

    private String basic;

    private String walls;

    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", walls='" + walls + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}
