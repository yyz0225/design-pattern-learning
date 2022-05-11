package com.yyz.design.pattern.chainofresponsibility;

/**
 * 购买请求类
 * @Author: yyz
 * @Date: 2022/5/11 12:47
 */
public class PurchaseRequest {

    /**
     * 请求类型
     */
    private int type=0;
    /**
     * 请求价格
     */
    private float price=0.0f;
    /**
     * id
     */
    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
