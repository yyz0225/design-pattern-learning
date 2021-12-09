package com.yyz.design.pattern.build;

/**
 * 建造者模式 测试类
 * @Author: yyz
 * @Date: 2021/12/9 13:00
 */
public class ClientWithBuilder {

    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirector director = new HouseDirector(commonHouseBuilder);
        House house = director.constructHouse();
        System.out.println(house);
    }
}
