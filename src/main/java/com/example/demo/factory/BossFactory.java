/**
 * 
 * 
 */
package com.example.demo.factory;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:19:16
 * @description
 */
public class BossFactory implements Factory{

	@Override
	public Enemy creat(int screenWidth) {
		return new Boss(screenWidth/2, 0);
	}

}
