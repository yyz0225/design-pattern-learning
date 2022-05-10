package com.yyz.design.pattern.state;

/**
 * 抽奖活动对象
 * @Author: yyz
 * @Date: 2022/5/10 19:29
 */
public class RaffleActivity {

    /**
     * state 表示当前活动状态,是变化的
     */
    AbstractState state = null;

    /**
     * 奖品数量
     */
    int count = 0;

    // 四个属性表示四种状态
    /**
     * 不能抽象状态
     */
    AbstractState noRaffleState = new NoRaffleState(this);
    /**
     * 可以抽奖状态
     */
    AbstractState canRaffleState = new CanRaffleState(this);
    /**
     * 发放奖品状态
     */
    AbstractState dispenseState = new DispenseState(this);
    /**
     * 奖品发放完毕状态
     */
    AbstractState dispenseOutState = new DispenseOutState(this);

    /**
     * 构造器 初始化当前状态为不能抽奖状态
     * @param count count
     */
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    /**
     * 扣分,调用当前状态的deductMoney
     */
    public void deductMoney(){
        state.deductMoney();
    }

    /**
     * 抽奖
     */
    public void raffle(){
        // 如果当前状态是抽奖成功
        if (state.raffle()) {
            // 领取奖品
            state.dispensePrize();
        }
    }

    /**
     * 这里请注意,奖品每次领取之后,奖品数量减1
     * @return
     */
    public int getCount() {
        int currentCount = count;
        currentCount--;
        return currentCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public AbstractState getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(AbstractState noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public AbstractState getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(AbstractState canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public AbstractState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(AbstractState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public AbstractState getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(AbstractState dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
