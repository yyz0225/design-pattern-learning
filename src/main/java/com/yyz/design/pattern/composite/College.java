package com.yyz.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院 包含多个专业节点
 * @Author: yyz
 * @Date: 2021/12/14 14:47
 */
public class College extends AbstractOrganizationComponent{

    /**
     * 专业节点
     */
    private List<AbstractOrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }


    /**
     * 重写add
     * @param component
     */
    @Override
    protected void add(AbstractOrganizationComponent component){
        organizationComponents.add(component);
    }

    /**
     * 重写remove
     * @param component
     */
    @Override
    protected void remove(AbstractOrganizationComponent component){
       organizationComponents.remove(component);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    /**
     * 输出包含所有的学院信息
     */
    @Override
    public void print() {
        System.out.println("=================="+getName()+"====================");
        for (AbstractOrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
