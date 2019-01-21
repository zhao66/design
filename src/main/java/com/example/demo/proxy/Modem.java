/**
 * 
 * 
 */
package com.example.demo.proxy;

/**
 * @author Yuriy
 * @date 2019年1月7日下午2:06:19
 * @description 调制解调器
 */
public class Modem implements Internet{

	@Override
	public void access(String url) {
		System.out.println("访问外网:"+url);
	}

}
