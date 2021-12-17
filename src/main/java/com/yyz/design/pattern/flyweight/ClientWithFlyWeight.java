package com.yyz.design.pattern.flyweight;

/**
 * 享元模式客户端调用类
 * @Author: yyz
 * @Date: 2021/12/16 12:45
 */
public class ClientWithFlyWeight {

    public static void main(String[] args) {
        // 创建一个网站工厂
        WebsiteFactory factory = new WebsiteFactory();

        // 客户要一个新闻的形式发布网站

        Website website1 = factory.getWebsiteCategory("新闻");

        // tom使用网站
        website1.use(new User("tom"));

        // 客户要一个博客形式发布网站

        Website website2 = factory.getWebsiteCategory("博客");

        website2.use(new User("jack"));

        // 客户要一个博客形式发布网站
        Website website3 = factory.getWebsiteCategory("博客");

        website2.use(new User("smith"));

        // 客户要一个博客形式发布网站
        Website website4 = factory.getWebsiteCategory("博客");

        website2.use(new User("red"));

        System.out.println("网站总数:"+factory.getWebsiteCount());
    }
}
