/**
 * 
 * 
 */
package com.example.demo.oberver;

/**
 * @author Yuriy
 * @date 2019年1月8日下午2:46:05
 * @description
 */
public class Buyer01 {
	private String name;
	private Shop01 shop;
	
	public Buyer01(String name,Shop01 shop) {
		this.name = name;
		this.shop = shop;
	}
	public void buy() {
		System.out.print(name + "购买:");
		System.out.println(shop.getProduct());
	}
}
