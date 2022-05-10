package com.yyz.design.pattern.state;

/**
 * 状态模式测试类
 * @Author: yyz
 * @Date: 2022/5/10 20:10
 */
public class ClientWithState {

    public static void main(String[] args) {
        // 创建活动对象,有1个奖品
        RaffleActivity activity = new RaffleActivity(1);

        activity.raffle();
        // 连续300次抽奖
        for (int i = 0; i < 30; i++) {
            System.out.println("第"+(i+1)+"次抽奖...");

            // 参加抽奖步骤,第一步,扣除积分
            activity.deductMoney();
            // 抽奖
            activity.raffle();
        }
    }
}
