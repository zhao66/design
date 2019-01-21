/**
 * 
 * 
 */
package com.example.demo.decorator;

/**
 * @author Yuriy
 * @date 2019年1月9日上午10:13:12
 * @description
 */
public class FoundationMakeup extends Decorator{

	public FoundationMakeup(Showable showable) {
		super(showable);
	}

	@Override
	public void show() {
		System.out.print("打粉底(");
		showable.show();
		System.out.print(")");
	}

}
