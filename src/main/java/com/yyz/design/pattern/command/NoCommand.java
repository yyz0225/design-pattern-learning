package com.yyz.design.pattern.command;

/**
 * 空命令
 * 没有任何命令,即空执行;用于初始化每个按钮,当对象调用时什么也不做
 * 其实,这样是一种设计模式,可以省略空判断
 * @Author: yyz
 * @Date: 2021/12/21 16:09
 */
public class NoCommand implements ICommand {

    /**
     * 执行方法
     */
    @Override
    public void execute() {

    }

    /**
     * 撤销方法
     */
    @Override
    public void undo() {

    }
}
