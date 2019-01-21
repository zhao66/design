/**
 * 
 * 
 */
package com.example.demo.oberver;

/**
 * @author Yuriy
 * @date 2019年1月8日下午3:08:34
 * @description
 */
public class AnyBuy extends Buyer02{

	public AnyBuy(String name, Shop02 shop) {
		super(name, shop);
	}

	@Override
	public void buy() {
		System.out.println(name+"购买 :"+shop.getProduct());
	}

}
