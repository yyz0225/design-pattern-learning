package com.yyz.design.pattern.prototype;

import java.io.Serializable;

/**
 * 深拷贝之实现Cloneable接口实现
 * @Author: yyz
 * @Date: 2021/12/8 16:06
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = -9176456250551880851L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }

    /**
     * 因此处全是String,故使用默认的clone方法即可
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }
}
