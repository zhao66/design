package com.example.demo.visitor;

import java.time.LocalDate;

import lombok.Data;

@Data
public abstract class Product {
	protected String name;
	protected LocalDate produceDate;
	protected float price;
	public Product(String name, LocalDate produceDate, float price) {
		super();
		this.name = name;
		this.produceDate = produceDate;
		this.price = price;
	}
	
}
