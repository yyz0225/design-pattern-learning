package com.yyz.design.pattern.composite;

/**
 * 组合模式客户端调用类
 * @Author: yyz
 * @Date: 2021/12/14 15:06
 */
public class ClientWithComposite {

    public static void main(String[] args) {
        // 从大到小创建对象
        // 创建大学=
        AbstractOrganizationComponent universityQH = new University("清华大学","中国顶尖大学");
        AbstractOrganizationComponent universityBJ = new University("北京大学","中国顶尖大学");

        // 创建学院
        AbstractOrganizationComponent collegeJSJ = new College("计算机学院","学技术的");
        AbstractOrganizationComponent college = new College("信息工程学院","信息技术学习");

        // 给学院添加专业
        collegeJSJ.add(new Department("网络工程","网络工程"));
        collegeJSJ.add(new Department("软件工程","软件工程"));
        collegeJSJ.add(new Department("计算机科学与技术","计算机科学与技术"));

        college.add(new Department("通信工程","通信工程"));
        college.add(new Department("信息工程","信息工程"));

        // 将学院添加到大学
        universityQH.add(collegeJSJ);
        universityQH.add(college);

        universityQH.print();
    }
}
