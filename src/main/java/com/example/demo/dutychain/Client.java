/**
 * 
 * 
 */
package com.example.demo.dutychain;

/**
 * @author Yuriy
 * @date 2019年1月4日下午5:55:36
 * @description
 */
public class Client {
	public static void main(String[] args) {
		Approver a = new Staff("张飞");
		a.setNextApprover(new Manager("关羽")).setNextApprover(new CEO("刘备"));
		a.approver(60000);
	}
}
