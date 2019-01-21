/**
 * 
 * 
 */
package com.example.demo.factory;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:13:52
 * @description
 */
public class Tank extends Enemy {

	public Tank(Integer x, Integer y) {
		super(x, y);
	}

	@Override
	public void show() {
		System.out.println("坦克出现坐标：" + x + "," + y);
		System.out.println("坦克向玩家发起攻击……");
	}

}
