/**
 * 
 * 
 */
package com.example.demo.oberver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuriy
 * @date 2019年1月8日下午2:55:06
 * @description
 */
public class Shop02 {
	private String product;
	private List<Buyer02> buyers;

	public Shop02() {
		this.product = "无货";
		this.buyers = new ArrayList<Buyer02>();
	}

	// 买家来店里进行登记
	public void register(Buyer02 buyer) {
		this.buyers.add(buyer);
	}

	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(String product) {
		this.product = product;// 到货
		notifyBuyers();
	}

	private void notifyBuyers() {
		buyers.stream().forEach(b -> b.buy());
	}
}
