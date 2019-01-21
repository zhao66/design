package com.example.demo.strategy;

/**
 * 开关类
 * @author Yuriy
 *
 */
public class Switcher {
	
	private Switchable switchable;

	public void setSwitchable(Switchable switchable) {
		this.switchable = switchable;
	}
	
	public void buttonOnClick(){
		System.out.println("按下开按钮...");
		switchable.on();
	}
	
	public void buttonOffClick(){
		System.out.println("按下关按钮...");
		switchable.off();
	}
	
}
