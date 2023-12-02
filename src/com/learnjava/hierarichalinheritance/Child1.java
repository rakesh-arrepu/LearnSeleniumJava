package com.learnjava.hierarichalinheritance;

public class Child1 extends Parent{

	Child1() {
		super();
		System.out.println("Child1 constructor is called");
	}
	
	void testChild1() {
		int score =200;
		System.out.println("Child 1 is called");
		System.out.println(score); //score var of Child class
		System.out.println(super.score); //score var of parent class
		super.testParent();
	}
	
	
	

}
