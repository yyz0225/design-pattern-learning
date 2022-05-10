package com.yyz.design.pattern.state;

/**
 * 状态模式 抽象状态对象
 * @Author: yyz
 * @Date: 2022/5/10 19:23
 */
public abstract class AbstractState {

    /**
     * 扣除50积分
     */
    public abstract void deductMoney();

    /**
     * 是否抽中奖品
     * @return boolean
     */
    public abstract boolean raffle();

    /**
     * 发放奖品
     */
    public abstract void dispensePrize();


}
