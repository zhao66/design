/**
 * 
 * 
 */
package com.example.demo.oberver;

/**
 * @author Yuriy
 * @date 2019年1月8日下午2:48:25
 * @description
 */
public class Client01 {
	public static void main(String[] args) {
		Shop01 shop = new Shop01();
		Buyer01 buyer = new Buyer01("tom", shop);
		Buyer01 buyer02 = new Buyer01("tony", shop);
		buyer.buy();
		buyer02.buy();
		shop.setProduct("iphone");
		buyer.buy();
	}
}
