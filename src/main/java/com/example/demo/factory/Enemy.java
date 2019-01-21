/**
 * 
 * 
 */
package com.example.demo.factory;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:02:16
 * @description
 */
public  abstract class Enemy {
	protected Integer x;
	protected Integer y;
	
	public Enemy(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void show();
}
