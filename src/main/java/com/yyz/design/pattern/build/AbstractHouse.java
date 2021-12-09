package com.yyz.design.pattern.build;

/**
 * 房屋抽象类
 * @Author: yyz
 * @Date: 2021/12/9 12:18
 */
public abstract class AbstractHouse {

    /**
     * 打地基
     */
   abstract void buildBasics();

    /**
     * 砌墙
     */
   abstract void buildWalls();

    /**
     * 封顶
     */
   abstract void roofed();

    /**
     * 构建方法
     */
   public void build(){
       buildBasics();
       buildWalls();
       roofed();
   }
}
