package com.yyz.design.pattern.command;

/**
 * 命令模式的客户端调用方法
 * @Author: yyz
 * @Date: 2021/12/21 16:47
 */
public class ClientWithCommand {

    public static void main(String[] args) {
        // 创建指定接收者
        LightReceiver lightReceiver = new LightReceiver();
        // 创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        // 需要一个远程控制器 遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        System.out.println("按下电灯的开按钮....");
        remoteController.onButtonWasPushed(0);
        System.out.println("按下电灯的关按钮...");
        remoteController.offButtonWasPushed(0);
        System.out.println("按下电灯的撤销按钮...");
        remoteController.undoButtonWasPushed();

        // 创建电视接收者
        TVReceiver tvReceiver = new TVReceiver();
        // 创建电视开关命令
        ICommand tvOnCommand = new TVOnCommand(tvReceiver);
        ICommand tvOffCommand = new TVOffCommand(tvReceiver);
        // 设置电视开关命令
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);
        // 验证电视开关命令
        System.out.println("打开电视机...");
        remoteController.onButtonWasPushed(1);
        System.out.println("关闭电视机...");
        remoteController.offButtonWasPushed(1);
        System.out.println("撤销之前对电视机的操作哟...");
        remoteController.undoButtonWasPushed();

    }
}
