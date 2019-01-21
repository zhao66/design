/**
 * 
 * 
 */
package com.example.demo.dutychain;

/**
 * @author Yuriy
 * @date 2019年1月4日下午5:52:21
 * @description 经理
 */
public class Manager extends Approver{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void approver(int amount) {
		if (amount <= 5000) {
			System.out.println("审批通过。【经理：" + name + "】");
		} else {
			System.out.println("无权审批，升级处理。【经理：" + name + "】");
			this.nextApprover.approver(amount);
		}
	}

}
