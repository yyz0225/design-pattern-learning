package com.yyz.design.pattern.build;

/**
 * 传统方式的问题 产品和创建产品的过程封装到一起了,增强了耦合性
 * @Author: yyz
 * @Date: 2021/12/9 12:24
 */
public class ClientTraditional {


    public static void main(String[] args) {
     // 房子和构建房子的过程封装到了一起,增强了耦合性
    AbstractHouse commonHouse = new CommonHouse();
    commonHouse.build();
    }

}
