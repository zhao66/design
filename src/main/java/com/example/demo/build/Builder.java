package com.example.demo.build;

/**
 * 施工方接口
 * @author Yuriy
 *
 */
public interface Builder {
	void buildBasement();
	void bulidWall();
	void buildRoof();
	Building getBuilding();
}
