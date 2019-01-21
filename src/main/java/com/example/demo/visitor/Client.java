package com.example.demo.visitor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Visitor discountVisitor = new DiscountVisitor(LocalDate.of(2019, 1, 1));
		/*List<? extends Product> products = Arrays.asList(new Candy("大白兔奶糖", LocalDate.of(2018, 10, 1), 20.00f),
					 new Wine("金六福酒", LocalDate.of(2018, 10, 1), 218.00f),
					 new Fruit("猕猴桃", LocalDate.of(2018, 10, 1), 18.00f)
					 );*/
		List<Acceptable> products = new ArrayList<Acceptable>();
		Candy candy = new Candy("大白兔奶糖", LocalDate.of(2018, 10, 1), 20.00f);
		Wine wine = new Wine("金六福酒", LocalDate.of(2018, 10, 1), 218.00f);
		Fruit fruit = new Fruit("猕猴桃", LocalDate.of(2018, 10, 1), 18.00f);
		products.add(candy);
		products.add(wine);
		products.add(fruit);
		
		for(Acceptable acceptable :products){
			acceptable.accept(discountVisitor);
		}
	}
}
