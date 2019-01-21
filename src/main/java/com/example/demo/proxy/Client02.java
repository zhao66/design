/**
 * 
 * 
 */
package com.example.demo.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Yuriy
 * @date 2019年1月7日下午3:27:23
 * @description
 */
public class Client02 {
	public static void main(String[] args) {
		Internet internet = (Internet)Proxy.newProxyInstance(Modem.class.getClassLoader(),
							   Modem.class.getInterfaces(), 
							   new KeyWordFilter(new Modem()));
		internet.access("http://www.电影.com");
		internet.access("http://www.游戏.com");
		internet.access("http://www.学习.com");
		internet.access("http://www.工作.com");
		
		System.out.println("我是一道华丽的分割线");
		
		Intranet intranet = (Intranet)Proxy.newProxyInstance(Switch.class.getClassLoader(), 
							   Switch.class.getInterfaces(),
							   new KeyWordFilter(new Switch()));
		 intranet.fileAccess("\\192.168.177.183\\电影\\superMan.mp4");
		 intranet.fileAccess("\\192.68.1.2\\共享\\游戏\\Hero.exe");
		 intranet.fileAccess("\\192.68.1.4\\shared\\Java学习资料.zip");
		 intranet.fileAccess("\\192.68.1.6\\Java知音\\设计模式是什么鬼.doc");
	}
}
