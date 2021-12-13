package com.yyz.design.pattern.prototype;

/**
 * 克隆羊问题,传统解决办法,使用new 关键字构建新的对象
 * 优点简单,易理解;
 * 缺点就是复杂对象,效率较低
 * @Author: yyz
 * @Date: 2021/12/8 13:00
 */
public class ClientTraditional {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"白色");
        sheep.setFriend(new Sheep("jerry",2,"黑色"));
        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        sheep1.setFriend(sheep.getFriend());
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        sheep2.setFriend(sheep.getFriend());

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
    }
}
