package com.yyz.design.pattern.decorator;

/**
 * 饮品抽象类
 * @Author: yyz
 * @Date: 2021/12/14 12:42
 */
public abstract class Drink {

    /**
     * 描述
     */
    public String des;

    /**
     * 价格
     */
    private float price = 0.0f;

    /**
     * 计算费用的方法,交给子类去实现
     * @return
     */
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
