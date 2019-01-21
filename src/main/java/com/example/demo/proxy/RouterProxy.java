/**
 * 
 * 
 */
package com.example.demo.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yuriy
 * @date 2019年1月7日下午2:07:47
 * @description 路由器代理类
 */
public class RouterProxy implements Internet{
	
	private Internet modem;
	
	private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");
	 
	public RouterProxy() {
		this.modem = new Modem();
		System.out.println("拨号上网...连接成功");
	}
	
	@Override
	public void access(String url) {
		for(String str:blackList){
			if(url.contains(str)){
				System.out.println("禁止访问:"+url);
				return;
			}
		}
		modem.access(url);
	}

}
