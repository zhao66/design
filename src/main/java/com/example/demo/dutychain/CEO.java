/**
 * 
 * 
 */
package com.example.demo.dutychain;

/**
 * @author Yuriy
 * @date 2019年1月4日下午5:53:59
 * @description CEO
 */
public class CEO extends Approver{

	public CEO(String name) {
		super(name);
	}

	@Override
	public void approver(int amount) {
		 if(amount <=10000){
			 System.out.println("审批通过。【CEO：" + name + "】");
		 }else{
			 System.out.println("驳回申请。【CEO：" + name + "】");
		 }
	}

}
