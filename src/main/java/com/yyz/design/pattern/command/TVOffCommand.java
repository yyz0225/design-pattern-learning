package com.yyz.design.pattern.command;

/**
 * 电视关闭命令
 * @Author: yyz
 * @Date: 2021/12/22 11:08
 */
public class TVOffCommand implements ICommand{

    private TVReceiver receiver;

    public TVOffCommand(TVReceiver receiver) {
        super();
        this.receiver = receiver;
    }


    /**
     * 执行方法
     */
    @Override
    public void execute() {
        receiver.off();
    }

    /**
     * 撤销方法
     */
    @Override
    public void undo() {
        receiver.on();
    }
}
