package com.yyz.design.pattern.principle.dependencereversion;

/**
 * @Author: yyz
 * @Date: 2021/9/27 16:18
 */
public class Email1 implements IReceiver{

    @Override
    public String getInfo(){
        return "email: hello world!";
    }
}
