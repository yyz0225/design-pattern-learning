package com.yyz.design.pattern.prototype;

/**
 * 克隆羊问题 深拷贝实现的两种方式
 * 深拷贝
 * @Author: yyz
 * @Date: 2021/12/8 13:00
 */
public class ClientWithDeepCloneable {

    public static void main(String[] args) throws Exception{
       DeepCloneProtoType deepCloneProtoType = new DeepCloneProtoType();
       deepCloneProtoType.name = "深拷贝";
       deepCloneProtoType.deepCloneableTarget = new DeepCloneableTarget("克隆名称","克隆类");
        System.out.println(deepCloneProtoType.hashCode());
        System.out.println(deepCloneProtoType);

       // 深拷贝之实现Cloneable接口,重写Object类的clone方法,并逐一拷贝引用的类
        DeepCloneProtoType deepCloneProtoType1 = (DeepCloneProtoType) deepCloneProtoType.clone();
        System.out.println("名字:"+deepCloneProtoType1.name+",hashcode:"+deepCloneProtoType1.hashCode());
        System.out.println(deepCloneProtoType1);

        // 深拷贝之序列化,反序列化
        DeepCloneProtoType deepCloneProtoType2 = (DeepCloneProtoType)deepCloneProtoType.deepClone();
        System.out.println("名字:"+deepCloneProtoType2.name+",hashcode:"+deepCloneProtoType2.hashCode());
        System.out.println(deepCloneProtoType2);

    }
}
