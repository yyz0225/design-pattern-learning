package com.yyz.design.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 对象结构 数据结构,管理很多人(man,woman)
 * @Author: yyz
 * @Date: 2022/3/30 16:48
 */
public class ObjectStructure {

    /**
     * 高层接口 高层元素的列表
     */
    public List<AbstractPerson> personList = new LinkedList<>();

    /**
     * 添加人员
     * @param person 人员
     */
    public void attach(AbstractPerson person){
        personList.add(person);
    }

    /**
     * 移除人员
     * @param person 人员
     */
    public void detach(AbstractPerson person){
        personList.remove(person);
    }


    /**
     * 显示测评结果
     * @param visitor 访问者
     */
    public void display(AbstractActionVisitor visitor){
        for (AbstractPerson abstractPerson : personList) {
            abstractPerson.accept(visitor);
        }
    }


}
