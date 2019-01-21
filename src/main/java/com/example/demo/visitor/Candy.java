package com.example.demo.visitor;

import java.time.LocalDate;

public class Candy extends Product implements Acceptable{

	public Candy(String name, LocalDate produceDate, float price) {
		super(name, produceDate, price);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);//把自己交给拜访者
		
	}

}
