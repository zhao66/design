/**
 * 
 * 
 */
package com.example.demo.factory;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:13:06
 * @description
 */
public class Airplane extends Enemy {

	public Airplane(Integer x, Integer y) {
		super(x, y);
	}

	@Override
	public void show() {
		System.out.println("飞机出现坐标：" + x + "," + y);
		System.out.println("飞机向玩家发起攻击……");
	}

}
