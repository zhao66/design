/**
 * 
 * 
 */
package com.example.demo.dutychain;

/**
 * @author Yuriy
 * @date 2019年1月4日下午5:47:15
 * @description 普通员工
 */
public class Staff extends Approver{
	
	public Staff(String name) {
		super(name);
	}

	@Override
	public void approver(int amount) {
		if (amount <= 1000) {
			System.out.println("审批通过。【员工：" + name + "】");
		} else {
			System.out.println("无权审批，升级处理。【员工：" + name + "】");
			this.nextApprover.approver(amount);
		}
	}

	
}
