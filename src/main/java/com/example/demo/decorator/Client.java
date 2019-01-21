/**
 * 
 * 
 */
package com.example.demo.decorator;

/**
 * @author Yuriy
 * @date 2019年1月9日上午10:24:15
 * @description
 */
public class Client {
	public static void main(String[] args) {
		Girl girl = new Girl();
		Showable makeupGirl = new FoundationMakeup(new Lipstick(girl));
		makeupGirl.show();
	}
}
