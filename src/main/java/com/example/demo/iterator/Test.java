/**
 * 
 * 
 */
package com.example.demo.iterator;

/**
 * @author Yuriy
 * @date 2019年1月8日下午4:30:27
 * @description
 */
public class Test {
	public static void main(String[] args) {
		DirverRecoder dirverRecoder = new DirverRecoder();
		for(int i =0 ;i<12;i++){
			dirverRecoder.append("视频_"+i);
		}
		dirverRecoder.display();
		System.out.println("----------------------");
		dirverRecoder.DisplayDesc();
	}
}
