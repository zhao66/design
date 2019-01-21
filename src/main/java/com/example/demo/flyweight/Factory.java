/**
 * 
 * 
 */
package com.example.demo.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yuriy
 * @date 2019年1月7日下午4:20:39
 * @description
 */
public class Factory {
	private Map<String,Drawable> images;
	public Factory() {
		this.images = new HashMap<String,Drawable>();
	}
	
	public Drawable getDrawable(String image){
		if(!images.containsKey(image)){
			switch (image) {
			case "河流":
				images.put(image, new Water());
				break;
			case "草坪":
				images.put(image, new Grass());
				break;
			default:
				break;
			}
		}
		return images.get(image);
	}
	
}
