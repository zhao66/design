/**
 * 
 * 
 */
package com.example.demo.flyweight;

/**
 * @author Yuriy
 * @date 2019年1月7日下午4:26:15
 * @description
 */
public class Client {
	public static void main(String[] args) {
		
		Factory f = new Factory();
		
		f.getDrawable("河流").draw(10,11);
		f.getDrawable("草坪").draw(20,21);
		f.getDrawable("草坪").draw(33, 34);
	}
}
