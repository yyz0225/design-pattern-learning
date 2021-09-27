package com.yyz.design.pattern.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 学校管理类
 * @Author: yyz
 * @Date: 2021/9/27 18:32
 */
public class SchoolManager {

    /**
     * 返回总部所有员工
     * @return
     */
    public List<Employee> getAllEmployee(){

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("总部员工Id="+i);
            employees.add(employee);
        }
        return employees;
    }


    /**
     * 输出总部员工和学院员工的所有信息(id)
     * @param collegeManager collegeManager 不是直接朋友,违反了迪米特法则
     */
    void printAllEmployee(CollegeManager collegeManager){

        List<CollegeEmployee> employees = collegeManager.getAllEmployee();
        System.out.println("-----------学院员工------------");
        for (CollegeEmployee employee : employees) {
            System.out.println(employee.getId());
        }

        List<Employee> employeeList = this.getAllEmployee();
        System.out.println("-----------总部员工------------");
        for (Employee employee : employeeList) {
            System.out.println(employee.getId());
        }
    }
}
