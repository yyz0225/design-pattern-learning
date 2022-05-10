package com.yyz.design.pattern.state;

/**
 * 发放奖品状态
 * @Author: yyz
 * @Date: 2022/5/10 19:27
 */
public class DispenseState extends AbstractState{

    // 初始化传入活动引用
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 已经扣除过积分,不能再扣
     */
    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分...");
    }

    /**
     * 可以抽奖,抽完奖后,根据实际情况,修改抽奖状态
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("不能抽奖...");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount()>0) {
            System.out.println("恭喜中奖了...");
            // 设置不能抽奖状态
            activity.setState(activity.getNoRaffleState());
        }else {
            System.out.println("很遗憾,奖品发送完了...");
            // 改变状态为奖品发送完毕,后面就不可以抽奖了
            activity.setState(activity.getDispenseOutState());
            System.out.println("抽奖活动结束");
            System.exit(0);
        }
    }
}
