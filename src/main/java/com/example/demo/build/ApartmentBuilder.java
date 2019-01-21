package com.example.demo.build;

/**
 * 高层公寓施工队
 * 
 * @author Yuriy
 *
 */
public class ApartmentBuilder implements Builder {
	private Building apartment;

	public ApartmentBuilder() {
		apartment = new Building();
	}

	@Override
	public void buildBasement() {
		System.out.println("深挖地基，修建地下车库，部署管道、线缆、风道。");
		apartment.setBasement("╚═════════╝");
	}

	@Override
	public void bulidWall() {
		System.out.println("搭建多层建筑框架，建造电梯井，钢筋混凝土浇灌。");
		for (int i = 0; i < 8; i++) {// 此处假设固定8层
			apartment.setWall("║ □ □ □ □ ║");
		}

	}

	@Override
	public void buildRoof() {
		System.out.println("封顶，部署通风井，做防水层，保温层。");
		apartment.setRoof("╔═════════╗");

	}

	@Override
	public Building getBuilding() {
		return apartment;
	}

}
