package com.yyz.design.pattern.state;

/**
 * 奖品发放完毕状态
 * @Author: yyz
 * @Date: 2022/5/10 19:27
 */
public class DispenseOutState extends AbstractState{

    // 初始化传入活动引用
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 已经扣除过积分,不能再扣
     */
    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了,请下次参加...");
    }

    /**
     * 可以抽奖,抽完奖后,根据实际情况,修改抽奖状态
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了,请下次参加...");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了,请下次参加...");
    }
}
