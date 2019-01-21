/**
 * 
 * 
 */
package com.example.demo.oberver;

/**
 * @author Yuriy
 * @date 2019年1月8日下午3:09:27
 * @description
 */
public class Client02 {
	public static void main(String[] args) {
		Shop02 shop = new Shop02();
		Buyer02 phoneBuyer = new PhoneBuyer("han", shop);
		Buyer02 anyBuy = new AnyBuy("zhao", shop);
		
		shop.register(phoneBuyer);
		shop.register(anyBuy);
		
		shop.setProduct("iphonex");
		shop.setProduct("huawei");
	}
	
}
