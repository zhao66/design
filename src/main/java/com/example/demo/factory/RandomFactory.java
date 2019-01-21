/**
 * 
 * 
 */
package com.example.demo.factory;

import java.util.Random;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:16:27
 * @description
 */
public class RandomFactory implements Factory{
	
	private Random random = new Random();

	@Override
	public Enemy creat(int screenWidth) {
		Enemy enemy = null;
		if(random.nextBoolean()){
			enemy = new Airplane(random.nextInt(screenWidth), 0);
		}else{
			enemy = new Tank(random.nextInt(screenWidth),0 );
		}
		return enemy;
	}
	
}
