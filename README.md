# design-pattern-learning
design-pattern-learning

##设计模式学习笔记

一.设计模式七大原则
1.单一职责 一个类和方法应只负责某一项职责
2.接口隔离 一个类对另一个的依赖应建立在最小的接口上
3.依赖倒置 面向接口编程
4.里氏替换 所有使用基类的地方必须能透明的使用其子类;子类中尽量不要重写父类的方法,会破坏继承体系;适当的情况下,采用聚合,依赖和组合方式解决
5.开闭原则 对扩展开放对修改关闭
6.迪米特法则 最少知道原则,一个类应该对自己依赖的类知道的越少越好,只与直接朋友通信(成员变量,方法参数,方法返回值)
7.合成复用 尽量使用合成/聚合的方式,而不是继承


二.设计模式

5种创建型设计模式:   关注如何创建对象，将对象的创建和使用相分离，分为：单例模式、工厂方法模式、抽象工厂模式、原型模式、建造者模式
7种结构型设计模式：  关注如何组合各种对象获得更好、更灵活的结构，分为：适配器模式、桥接模式、组合模式、装饰器模式、代理模式、享元模式、外观模式
11种行为型设计模式： 涉及算法和对象间的职责分配，一组对象间协调完成一个整体的任务，分为：责任链模式、命令模式、解释器模式、迭代器模式、中介模式、
                    备忘录模式、观察者模式、模板方法模式、状态模式、策略模式、访问者模式
                    
1)5种创建型设计模式        
            
1.单例模式(8种) 一个类只有一个实例,提供单个的全局访问点
  饿汉式(静态常量)
  饿汉式(静态代码块)
  懒汉式(线程不安全)
  懒汉式(线程安全,同步方法)
  懒汉式(线程安全,同步代码块)
  双重校验锁
  静态内部类
  枚举类
  使用场景: 频繁使用和创建的对象、创建对象耗时或资源过多的对象(重量级对象)、工具类对象、频繁访问数据库或文件的对象(如数据源、session工厂等)
2.工厂方法模式 专门的工厂类来创建对象
  工厂方法模式(简单工厂模式、工厂方法模式、静态工厂方法模式)
3. 抽象工厂模式(简单工厂模式+工厂方法模式的整合,抽象出更加抽象的接口)
4.原型模式(原对象的克隆体,需要区分深拷贝和浅拷贝)  
  实现方式: 1.实现Cloneable接口,重写clone方法(浅拷贝,若要实现深拷贝,需要把依赖的对象一层层复制完毕即可)
           2.序列化与反序列化实现(深拷贝)
5.建造者模式(将复杂对象的创建过程封装起来,对外屏蔽具体的创建过程,对外提供一个build方法即可)   


2)7种结构型设计模式

1.装饰器模式    










   