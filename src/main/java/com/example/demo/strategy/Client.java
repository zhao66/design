package com.example.demo.strategy;

/**
 * 测试类
 * @author Yuriy
 *
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("===客户端用【开关】操作电器===");
		Switcher switcher = new Switcher();
		switcher.setSwitchable(new Bulb());
		switcher.buttonOnClick();
		switcher.buttonOffClick();
	}
}
