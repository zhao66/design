package com.example.demo.strategyandcmd;

public class Client {
	public static void main(String[] args) {
		 System.out.println("===客户端用【可编程式遥控器】操作电器===");
	     Device tv = new TV();
	     Controller controller = new Controller();
	    // 绑定【电视机】的【命令】到【控制器按键】
	     controller.bindOKCommand(new SwitchCommand(tv));
	     controller.bindVerticalCommand(new ChannelCommand(tv));
	     controller.bindHorizontalCommand(new VolumeCommand(tv));
	     controller.buttonOKHold();
	     controller.buttonLeftClick();
	     controller.buttonRightClick();
	     controller.buttonOKClick();
	}
}
