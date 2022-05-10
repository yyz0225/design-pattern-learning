package com.yyz.design.pattern.strategy;

/**
 * 抽象类 鸭子 策略上下文
 * @Author: yyz
 * @Date: 2022/5/10 20:52
 */
public abstract class AbstractDuckStrategy {

    private FlyBehaviorStrategy flyBehaviorStrategy;

    private SwimBehaviorStrategy swimBehaviorStrategy;

    private QuackBehaviorStrategy quackBehaviorStrategy;

    /**
     * 显示鸭子信息
     */
    public abstract void display();

    /**
     * 飞翔技术通过,指定策略实现
     */
    public void fly(){
        if (flyBehaviorStrategy != null) {
            flyBehaviorStrategy.fly();
        }
    }

    /**
     * 游泳技术通过,指定策略实现
     */
    public void swim(){
        if (swimBehaviorStrategy != null) {
            swimBehaviorStrategy.swim();
        }
    }

    /**
     * 叫声技术通过,指定策略实现
     */
    public void quack(){
        if (quackBehaviorStrategy != null) {
            quackBehaviorStrategy.quack();
        }
    }

    public FlyBehaviorStrategy getFlyBehaviorStrategy() {
        return flyBehaviorStrategy;
    }

    public void setFlyBehaviorStrategy(FlyBehaviorStrategy flyBehaviorStrategy) {
        this.flyBehaviorStrategy = flyBehaviorStrategy;
    }

    public SwimBehaviorStrategy getSwimBehaviorStrategy() {
        return swimBehaviorStrategy;
    }

    public void setSwimBehaviorStrategy(SwimBehaviorStrategy swimBehaviorStrategy) {
        this.swimBehaviorStrategy = swimBehaviorStrategy;
    }

    public QuackBehaviorStrategy getQuackBehaviorStrategy() {
        return quackBehaviorStrategy;
    }

    public void setQuackBehaviorStrategy(QuackBehaviorStrategy quackBehaviorStrategy) {
        this.quackBehaviorStrategy = quackBehaviorStrategy;
    }
}
