/**
 * 
 * 
 */
package com.example.demo.flyweight;

/**
 * @author Yuriy
 * @date 2019年1月7日下午4:16:51
 * @description
 */
public class Water implements Drawable{
	private String image;
	
	public Water() {
		this.image = "河流";
		System.out.print("从磁盘加载[" + image + "]图片，耗时半秒。。。");
	}
	@Override
	public void draw(int x, int y) {
		System.out.println("在位置[" + x + ":" + y + "]上绘制图片：[" + image + "]");
	}

}
