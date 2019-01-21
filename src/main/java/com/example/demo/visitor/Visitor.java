package com.example.demo.visitor;

public interface Visitor {
	void visit(Candy candy);
	void visit(Fruit fruit);
	void visit(Wine wine);
}
