/**
 * 
 * 
 */
package com.example.demo.decorator;

/**
 * @author Yuriy
 * @date 2019年1月9日上午10:22:46
 * @description
 */
public class Lipstick extends Decorator{

	public Lipstick(Showable showable) {
		super(showable);
	}

	@Override
	public void show() {
		System.out.print("涂口红(");
		showable.show();
		System.out.print(")");
	}

}
