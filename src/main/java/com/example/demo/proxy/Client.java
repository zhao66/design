/**
 * 
 * 
 */
package com.example.demo.proxy;

/**
 * @author Yuriy
 * @date 2019年1月7日下午3:08:14
 * @description
 */
public class Client {
	public static void main(String[] args) {
		Internet proxy = new RouterProxy();
		proxy.access("http://www.电影.com");
		proxy.access("http://www.游戏.com");
		proxy.access("ftp://www.学习.com/java");
		proxy.access("http://www.工作.com");
	}
}
