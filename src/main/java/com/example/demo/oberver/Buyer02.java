/**
 * 
 * 
 */
package com.example.demo.oberver;

/**
 * @author Yuriy
 * @date 2019年1月8日下午2:53:44
 * @description
 */
public abstract class Buyer02 {
	protected String name;
	protected Shop02 shop;
	public Buyer02(String name, Shop02 shop) {
		this.name = name;
		this.shop = shop;
	}
	public abstract void buy();
}
