/**
 * 
 * 
 */
package com.example.demo.factory;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:22:23
 * @description
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("game start...");
		int screenWidth = 100; 
		Factory f = new RandomFactory();
		
		for(int i = 0;i<=3;i++){
			f.creat(screenWidth).show();
		}
		
		System.out.println("boss coming...");
		f = new BossFactory();
		f.creat(screenWidth).show();
	}
}
