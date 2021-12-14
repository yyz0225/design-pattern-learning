package com.yyz.design.pattern.bridge;

/**
 * 桥接模式调用者
 * @Author: yyz
 * @Date: 2021/12/13 17:33
 */
public class ClientWithBridge {

    public static void main(String[] args) {

        Phone phone = new UpRightPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
    }
}
