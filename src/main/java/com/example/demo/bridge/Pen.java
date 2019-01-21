/**
 * 
 * 
 */
package com.example.demo.bridge;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:53:53
 * @description
 */
public abstract class Pen {
	protected Ruler ruler;

	public Pen(Ruler ruler) {
		this.ruler = ruler;
	}
	
	public abstract void draw();
}
