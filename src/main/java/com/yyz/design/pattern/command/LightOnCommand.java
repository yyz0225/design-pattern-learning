package com.yyz.design.pattern.command;

/**
 * 灯光开启命令
 * @Author: yyz
 * @Date: 2021/12/21 16:09
 */
public class LightOnCommand implements ICommand {

    private IReceiver light;

    public LightOnCommand(IReceiver light) {
        super();
        this.light = light;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        light.on();
    }

    /**
     * 撤销方法
     */
    @Override
    public void undo() {
        light.off();
    }
}
