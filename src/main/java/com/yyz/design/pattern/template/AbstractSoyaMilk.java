package com.yyz.design.pattern.template;

/**
 * 豆浆制作 模板方法
 * @Author: yyz
 * @Date: 2021/12/21 12:47
 */
public abstract class AbstractSoyaMilk {

    /**
     * 模板方法封装制作过程,可定义为final类型的,防止子类覆盖
     */
    public final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 选材
     */
    void select(){
        System.out.println("第一步: 选择新鲜的黄豆...");
    }

    /**
     * 添加配料 使用不同的配料可制作不同的豆浆口味
     */
    abstract void addCondiments();

    /**
     * 浸泡
     */
    void soak(){
        System.out.println("第三步: 将黄豆和配料放入水中浸泡3个小时....");
    }

    /**
     * 打碎
     */
    void beat(){
        System.out.println("第四步: 将黄豆和配料放到豆浆机里打碎....");
    }




}
