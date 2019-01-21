/**
 * 
 * 
 */
package com.example.demo.bridge;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:56:02
 * @description
 */
public class WhitePen extends Pen{

	public WhitePen(Ruler ruler) {
		super(ruler);
	}

	@Override
	public void draw() {
		System.out.print("白");
		ruler.rule();
	}

}
