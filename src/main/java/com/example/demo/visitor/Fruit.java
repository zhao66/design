package com.example.demo.visitor;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Fruit extends Product implements Acceptable{
	
	private float weight;
	
	public Fruit(String name, LocalDate produceDate, float price) {
		super(name, produceDate, price);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
