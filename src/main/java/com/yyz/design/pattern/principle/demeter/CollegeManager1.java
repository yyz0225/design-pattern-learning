package com.yyz.design.pattern.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理学院的员工管理类
 * @Author: yyz
 * @Date: 2021/9/27 18:28
 */
public class CollegeManager1 {

    /**
     * 返回学院的所有员工
     * @return
     */
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> collegeEmployees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工Id="+i);
            collegeEmployees.add(collegeEmployee);
        }
        return collegeEmployees;
    }

    public void printAllCollegeEmployee(){
        System.out.println("----------学院员工------------");
        for (CollegeEmployee collegeEmployee : this.getAllEmployee()) {
            System.out.println(collegeEmployee.getId());
        }
    }



}
