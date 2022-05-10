package com.yyz.design.pattern.state;

/**
 * 不能抽奖状态
 * @Author: yyz
 * @Date: 2022/5/10 19:27
 */
public class NoRaffleState extends AbstractState{

    // 初始化转入活动引用,扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 当前状态可以扣除积分,扣除积分后,将状态设置为可以抽奖状态
     */
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功,您可以抽奖了...");
        activity.setState(activity.getCanRaffleState());
    }

    /**
     * 当前状态不能抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("扣除了积分才可以抽奖哦...");
        return false;
    }

    /**
     * 当前状态不能发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品...");
    }
}
