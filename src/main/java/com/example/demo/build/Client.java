package com.example.demo.build;

public class Client {
	public static void main(String[] args) {
		Builder houseBuilder = new HouseBuilder();
		Director director = new Director(houseBuilder);
		System.out.println(director.direct());
		director.setBuilder(new ApartmentBuilder());
		System.out.println(director.direct());
	}
}
