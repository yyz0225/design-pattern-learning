package com.yyz.design.pattern.command;

/**
 * 远程控制器 调用者(命令发布者),包含多个命令
 * @Author: yyz
 * @Date: 2021/12/21 16:31
 */
public class RemoteController {

    /**
     * 开 按钮的命令数组
     */
    ICommand[] onCommands;
    /**
     * 关 按钮的命令数组
     */
    ICommand[] offCommands;

    /**
     * 撤销 按钮的命令数组
     */
    ICommand undoCommand;

    /**
     * 构造器,完成对按钮的初始化
     */
    public RemoteController() {
        onCommands = new ICommand[5];
        offCommands = new ICommand[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给我们的按钮,设置你需要的命令
     * @param no
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int no, ICommand onCommand, ICommand offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开按钮
     * @param no
     */
    public void onButtonWasPushed(int no){
        // 找到你设置的按钮,执行方法
        onCommands[no].execute();
        // 记录当前操作,便于撤销
        undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     * @param no
     */
    public void offButtonWasPushed(int no){
        // 找到你设置的按钮,执行方法
        offCommands[no].execute();
        // 记录当前操作,便于撤销
        undoCommand = offCommands[no];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
