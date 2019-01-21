/**
 * 
 * 
 */
package com.example.demo.decorator;

/**
 * @author Yuriy
 * @date 2019年1月9日上午10:07:03
 * @description
 */
public abstract class Decorator implements Showable {
	protected Showable showable;

	public Decorator(Showable showable) {
		this.showable = showable;
	}
}
