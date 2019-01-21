package com.example.demo.strategy;

/**
 * 灯泡类
 * @author Yuriy
 *
 */
public class Bulb implements Switchable{

	@Override
	public void on() {
		System.out.println("通电，灯泡亮");
	}

	@Override
	public void off() {
		System.out.println("断电，灯泡灭");
		
	}

}
