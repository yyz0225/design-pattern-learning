package com.yyz.design.pattern.memento;

/**
 * 游戏角色源对象 需要保存状态的对象
 * @Author: yyz
 * @Date: 2022/5/6 11:06
 */
public class GameRoleOriginator {

    /**
     * 攻击力
     */
    private String vif;

    /**
     * 防御力
     */
    private String def;

    public String getVif() {
        return vif;
    }

    public void setVif(String vif) {
        this.vif = vif;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    /**
     * 将当前对象状态保存到备忘录对象,并返回
     * @return Memento
     */
    public GameRoleMemento createMemento(){
        return new GameRoleMemento(vif,def);
    }

    /**
     * 从备忘录对象获取保存的对象状态
     * @param memento 备忘录对象
     */
    public void getStateFromMemento(GameRoleMemento memento){
        vif = memento.getVif();
        def = memento.getDef();
    }

    /**
     * 显示游戏角色的攻击力和防御力
     */
    public void display(){
        System.out.println("游戏角色的攻击力:"+this.vif+",防御力:"+this.def);
    }
}
