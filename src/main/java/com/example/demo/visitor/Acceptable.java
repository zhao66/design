package com.example.demo.visitor;

public interface Acceptable {
	//主动接受访问者拜访
	void accept(Visitor visitor);
}
