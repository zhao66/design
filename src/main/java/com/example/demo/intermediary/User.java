/**
 * 
 * 
 */
package com.example.demo.intermediary;

/**
 * @author Yuriy
 * @date 2019年1月8日下午5:20:30
 * @description
 */
public class User {
	private String name;
	private ChatRoom chatRoom;

	public User(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public void login(ChatRoom chatRoom) {
		chatRoom.connect(this);
		this.chatRoom = chatRoom;
	}

	public void talk(String msg) {
		chatRoom.sendMsg(this, msg);
	}

	public void listen(User fromWhom, String msg) {
		System.out.print("【" + this.name + "的对话框】");
		System.out.println(fromWhom.getName() + " 说： " + msg);
	}
}
