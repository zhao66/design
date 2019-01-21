/**
 * 
 * 
 */
package com.example.demo.iterator;

/**
 * @author Yuriy
 * @date 2019年1月8日下午4:23:30
 * @description
 */
public class DirverRecoder {
	private int index = -1;
	private String[] records = new String[10];// 假设只能记录10条视频
	public void append(String record){
		if(index == 9 ){
			index = 0 ;
		}else{
			index++;
		}
		records[index] = record;
	}
	public void display(){
		for (int i = 0;i<records.length;i++){
			System.out.println(i+":"+records[i]);
		}
	}
	
	public void DisplayDesc() {
		for (int i = (records.length - 1); i >= 0; i--) {
			System.out.println(i+":"+records[i]);
		}
	}
}
