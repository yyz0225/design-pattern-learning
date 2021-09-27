package com.yyz.design.pattern.principle.demeter;

/**
 * @Author: yyz
 * @Date: 2021/9/27 18:41
 */
public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());

        SchoolManager1 schoolManager1 = new SchoolManager1();
        schoolManager1.printAllEmployee(new CollegeManager1());
    }
}
