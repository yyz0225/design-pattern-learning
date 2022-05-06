package com.yyz.design.pattern.memento;

/**
 * 游戏角色备忘录对象 保存对象的状态
 * @Author: yyz
 * @Date: 2022/5/6 11:05
 */
public class GameRoleMemento {

    /**
     * 攻击力
     */
    private String vif;

    /**
     * 防御力
     */
    private String def;

    public GameRoleMemento(String vif, String def) {
        super();
        this.vif = vif;
        this.def = def;
    }

    public String getVif() {
        return vif;
    }

    public String getDef() {
        return def;
    }
}
