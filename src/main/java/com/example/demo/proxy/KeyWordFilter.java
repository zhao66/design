/**
 * 
 * 
 */
package com.example.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;


/**
 * @author Yuriy
 * @date 2019年1月7日下午3:20:13
 * @description
 */
public class KeyWordFilter implements InvocationHandler{
	
	private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");
	
	// 被代理的真实对象，猫，交换机，或者别的什么
	private Object origin;
	
	public KeyWordFilter(Object origin) {
		this.origin = origin;
		System.out.println("开启关键字过滤模式");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String arg = args[0].toString();
		for (String str : blackList){
			if(arg.contains(str)){
				System.out.println("禁止访问:"+arg);
				return null;
			}
		}
		return method.invoke(origin, arg);
	}

}
