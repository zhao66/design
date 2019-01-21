/**
 * 
 * 
 */
package com.example.demo.dutychain;

/**
 * @author Yuriy
 * @date 2019年1月4日下午5:41:51
 * @description 审批人抽象类
 */
public abstract class Approver {
	protected String name;
	protected Approver nextApprover;
	
	public Approver(String name) {
		this.name = name;
	}
	
	protected Approver setNextApprover(Approver nextApprover ){
		this.nextApprover = nextApprover;
		return this.nextApprover;
	}
	
	// 抽象审批方法由具体审批人子类实现
	public abstract void approver(int amount);
}
