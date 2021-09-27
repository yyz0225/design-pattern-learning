package com.yyz.design.pattern.principle.dependencereversion;

/**
 * 依赖倒置关系传递方式: 接口 构造方法 set方法
 * @Author: yyz
 * @Date: 2021/9/27 16:37
 */
public class DependencePass {
    public static void main(String[] args) {
        // 1.接口传递
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new ChangHong());

        // 2.构造方法传递
        OpenAndClose1 openAndClose1 = new OpenAndClose1(new ChangHong());
        openAndClose1.open();

        // 3.setter方式传递
        OpenAndClose2 openAndClose2 = new OpenAndClose2();
        openAndClose2.setTv(new ChangHong());
        openAndClose2.open();
    }
}
