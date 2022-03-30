package com.yyz.design.pattern.command;

/**
 * 电视开启命令
 * @Author: yyz
 * @Date: 2021/12/22 11:08
 */
public class TVOnCommand implements ICommand{

    private IReceiver receiver;

    public TVOnCommand(IReceiver receiver) {
        super();
        this.receiver = receiver;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        receiver.on();
    }

    /**
     * 撤销方法
     */
    @Override
    public void undo() {
        receiver.off();
    }
}
