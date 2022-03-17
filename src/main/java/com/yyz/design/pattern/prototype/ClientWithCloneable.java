package com.yyz.design.pattern.prototype;

/**
 * 克隆羊问题 实现Cloneable接口,重写Object类clone方法
 * 优点: 调用clone方法即可
 * 缺点: 浅拷贝(非基本类型对象的拷贝是引用传递,改变原对象,克隆后的对象会受影响),要实现深拷贝需要自己拷贝所有的对象
 * @Author: yyz
 * @Date: 2021/12/8 13:00
 */
public class ClientWithCloneable {

    public static void main(String[] args) {
        Sheep2 sheep2 = new Sheep2("tom",1,"白色");
        sheep2.setFriend(new Sheep2("jerry",2,"黑色"));
        Sheep2 sheep1 = (Sheep2) sheep2.clone();
        Sheep2 sheep21 = (Sheep2) sheep2.clone();

        System.out.println(sheep2);
        System.out.println(sheep1);
        System.out.println(sheep21);
        System.out.println(sheep2.getFriend().hashCode());
        System.out.println(sheep1.getFriend().hashCode());
        System.out.println(sheep21.getFriend().hashCode());
    }
}
