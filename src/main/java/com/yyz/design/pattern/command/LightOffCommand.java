package com.yyz.design.pattern.command;

/**
 * 灯光关闭命令
 * @Author: yyz
 * @Date: 2021/12/21 16:09
 */
public class LightOffCommand implements ICommand {

    private IReceiver light;

    public LightOffCommand(IReceiver light) {
        super();
        this.light = light;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        light.off();
    }

    /**
     * 撤销方法
     */
    @Override
    public void undo() {
        light.on();
    }
}
