/**
 * 
 * 
 */
package com.example.demo.intermediary;

/**
 * @author Yuriy
 * @date 2019年1月8日下午5:33:41
 * @description
 */
public class Client {
	public static void main(String[] args) {
		User u1 = new User("tom");
		User u2 = new User("jame");
		ChatRoom chatRoom = new ChatRoom("聊天室1");
		u1.login(chatRoom);
		u2.login(chatRoom);
		u1.talk("你好，jame！");
		u2.talk("tom,你好！");
	}
}
