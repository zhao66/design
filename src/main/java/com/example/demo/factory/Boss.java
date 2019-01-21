/**
 * 
 * 
 */
package com.example.demo.factory;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:19:53
 * @description
 */
public class Boss extends Enemy {

	public Boss(Integer x, Integer y) {
		super(x, y);
	}

	@Override
	public void show() {
		System.out.println("Boss出现坐标：" + x + "," + y);
		System.out.println("Boss向玩家发起攻击……");
	}

}
