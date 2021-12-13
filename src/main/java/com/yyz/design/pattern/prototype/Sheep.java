package com.yyz.design.pattern.prototype;

/**
 * 克隆羊实体
 * @Author: yyz
 * @Date: 2021/12/8 12:57
 */
public class Sheep {

    private String name;

    private int age;

    private String color;

    private String address ="蒙古羊";

    private Sheep friend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", friend=" + friend +
                '}';
    }
}
