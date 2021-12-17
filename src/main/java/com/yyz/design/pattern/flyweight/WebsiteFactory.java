package com.yyz.design.pattern.flyweight;

import java.util.HashMap;

/**
 * 网站工厂类,根据需要返回压一个工厂 缓冲池
 * @Author: yyz
 * @Date: 2021/12/16 12:36
 */
public class WebsiteFactory {

    /**
     * 集合对象,充当于池的作用
     */
    private HashMap<String,ConcreteWebsite> pool = new HashMap<>();

    /**
     * 根据网站的类型获取网站,如果没有,就创建一个,放到池中
     * @param type
     * @return
     */
    public Website getWebsiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    /**
     * 获取网站分类总数,池中有多少个对象
     * @return
     */
    public int getWebsiteCount(){
        return pool.size();
    }
}
