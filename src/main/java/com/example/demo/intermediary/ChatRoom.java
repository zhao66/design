/**
 * 
 * 
 */
package com.example.demo.intermediary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuriy
 * @date 2019年1月8日下午5:20:58
 * @description
 */
public class ChatRoom {
	private String name;
	List<User> users = new ArrayList<User>();

	public ChatRoom(String name) {
		this.name = name;
	}

	public void connect(User user) {
		this.users.add(user);
		System.out.println("欢迎【" + user.getName() + "】加入聊天室【" + this.name + "】");
	}

	public void sendMsg(User fromWhom, String msg) {
		users.stream().filter(user -> !user.equals(fromWhom)).forEach(toWhom -> toWhom.listen(fromWhom, msg));
	}
}
