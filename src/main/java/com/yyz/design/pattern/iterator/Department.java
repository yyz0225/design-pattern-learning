package com.yyz.design.pattern.iterator;

/**
 * 系
 * @Author: yyz
 * @Date: 2022/3/31 15:24
 */
public class Department {

    private String name;

    private String desc;

    public Department(String name, String desc) {
        super();
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
