/**
 * 
 * 
 */
package com.example.demo.proxy;

/**
 * @author Yuriy
 * @date 2019年1月7日下午3:18:26
 * @description
 */
public class Switch implements Intranet {

	@Override
	public void fileAccess(String path) {
		System.out.println("访问内网:" + path);
	}

}
