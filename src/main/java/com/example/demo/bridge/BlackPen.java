/**
 * 
 * 
 */
package com.example.demo.bridge;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:57:09
 * @description
 */
public class BlackPen extends Pen {

	public BlackPen(Ruler ruler) {
		super(ruler);
	}

	@Override
	public void draw() {
		System.out.print("黑");
		ruler.rule();
	}

}
