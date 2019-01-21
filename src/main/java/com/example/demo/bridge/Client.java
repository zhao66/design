/**
 * 
 * 
 */
package com.example.demo.bridge;

/**
 * @author Yuriy
 * @date 2019年1月7日上午10:58:00
 * @description
 */
public class Client {
	public static void main(String[] args) {
		new BlackPen(new RoundRuler()).draw();
		new WhitePen(new SquareRuler()).draw();
	}
}
