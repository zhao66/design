package com.example.demo.build;

/**
 * 监工
 * @author Yuriy
 *
 */
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Building direct(){
		System.out.println("项目启动");
		builder.buildBasement();
		builder.bulidWall();
		builder.buildRoof();
		System.out.println("项目竣工");
		return builder.getBuilding();
	}
}
