package com.yyz.design.pattern.factory;

/**
 * @Author: yyz
 * @Date: 2021/12/7 14:27
 */
public abstract class Pizza {

    private String name;

    abstract String getType();

    public void prepare(){
        System.out.println("prepare pizza....");
    }

    public void bake(){
        System.out.println("bake pizza....");
    }

    public void cut(){
        System.out.println("cut pizza....");
    }

    public void box(){
        System.out.println("box pizza.....");
    }

    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
