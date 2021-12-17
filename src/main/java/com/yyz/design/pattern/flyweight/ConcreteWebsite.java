package com.yyz.design.pattern.flyweight;

/**
 * 具体网站
 * @Author: yyz
 * @Date: 2021/12/16 12:31
 */
public class ConcreteWebsite extends Website {

    /**
     * 网站的发布形式(类型),共享的部分,内部状态
     */
    private String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式是:"+type+",使用者是:"+user.getName());
    }
}
