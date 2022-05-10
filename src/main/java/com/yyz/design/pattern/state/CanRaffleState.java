package com.yyz.design.pattern.state;

import java.security.SecureRandom;

/**
 * 可以抽奖的状态
 * @Author: yyz
 * @Date: 2022/5/10 19:27
 */
public class CanRaffleState extends AbstractState{

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 已经扣除过积分,不能再扣
     */
    @Override
    public void deductMoney() {
        System.out.println("已经扣除过了积分...");
    }

    /**
     * 可以抽奖,抽完奖后,根据实际情况,修改抽奖状态
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖,请稍等...");
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(10);
        // 10%中奖机会
        if (num == 0) {
            // 改变活动状态为发放奖品
            activity.setState(activity.getDispenseState());
            return true;
        }else {
            System.out.println("很遗憾,未抽中奖品...");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖,不能发放奖品...");
    }
}
