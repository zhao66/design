package com.example.demo.build;

import java.util.ArrayList;
import java.util.List;

/**
 * 建筑物
 * @author Yuriy
 *
 */
public class Building {
	private List<String> buildingCompents = new ArrayList<String>();
	
	public void setBasement(String baseMent){
		this.buildingCompents.add(baseMent);
	}
	
	public void setWall(String wall) {
		this.buildingCompents.add(wall);
	}
	
	public void setRoof(String roof) {
		this.buildingCompents.add(roof);
	}
	
	@Override
	public String toString() {
		String buildingStr = "";
		for (int i = buildingCompents.size() - 1; i >= 0; i--) {
			buildingStr += buildingCompents.get(i) + "\n";
		}
		return buildingStr;
	}
}
