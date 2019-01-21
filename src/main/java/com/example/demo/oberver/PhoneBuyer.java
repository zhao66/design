/**
 * 
 * 
 */
package com.example.demo.oberver;

/**
 * @author Yuriy
 * @date 2019年1月8日下午3:05:07
 * @description
 */
public class PhoneBuyer extends Buyer02{

	public PhoneBuyer(String name, Shop02 shop) {
		super(name, shop);
	}

	@Override
	public void buy() {
		String product = shop.getProduct();
		if(product.contains("iphonex")){
			System.out.print(name);
			System.out.println("购买:"+product);
		}
	}

}
