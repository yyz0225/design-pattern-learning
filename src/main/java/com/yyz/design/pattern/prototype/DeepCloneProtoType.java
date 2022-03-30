package com.yyz.design.pattern.prototype;

import java.io.*;

/**
 * 深拷贝实现对象
 * @Author: yyz
 * @Date: 2021/12/8 16:18
 */
public class DeepCloneProtoType implements Serializable, Cloneable {

    private static final long serialVersionUID = 5451472271453719432L;

    public String name;

    /**
     * 引用类型
     */
    public DeepCloneableTarget deepCloneableTarget;

    public DeepCloneProtoType() {
        super();
    }

    /**
     * 深拷贝实现方式之一实现Cloneable接口,重写Object类的clone方法,并且将引用类型属性,也要手动单独处理,复制完毕
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;

        // 这里完成基本数据类型和String类型的克隆
        deep = super.clone();
        // 这里单独处理引用类型
        DeepCloneProtoType target = (DeepCloneProtoType)deep;
        target.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
        return target;
    }

    /**
     * 深拷贝实现方式之二使用字节数组流和对象流,运用序列化和反序列手段实现
     * @return
     */
    public Object deepClone(){
        try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos)){
            // 序列化 java对象转成底层字节数组流
            out.writeObject(this);

            // 反序列化 底层字节数组流还原成java对象
            try( ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream input = new ObjectInputStream(bis);){
                return input.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "DeepCloneProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}
