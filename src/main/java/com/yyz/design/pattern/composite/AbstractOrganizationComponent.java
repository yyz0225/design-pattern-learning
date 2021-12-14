package com.yyz.design.pattern.composite;

/**
 * 组织机构抽象类
 * @Author: yyz
 * @Date: 2021/12/14 14:39
 */
public abstract class AbstractOrganizationComponent {

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String des;

    public AbstractOrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    protected void add(AbstractOrganizationComponent component){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(AbstractOrganizationComponent component){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    /**
     * 打印方法,交给每个子类去实现
     */
    public abstract void print();
}
