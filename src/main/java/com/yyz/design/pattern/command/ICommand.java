package com.yyz.design.pattern.command;

/**
 * 命令接口
 * @Author: yyz
 * @Date: 2021/12/21 16:00
 */
public interface ICommand {

    /**
     * 执行方法
     */
    void execute();

    /**
     * 撤销方法
     */
    void undo();
}
