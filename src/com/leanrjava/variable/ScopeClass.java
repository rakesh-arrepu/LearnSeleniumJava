package com.leanrjava.variable;

public class ScopeClass {

	
	
	static int  var = 10; // Instance/static variable
	
	
	public static void main(String[] args){
		System.out.println("In Main Block: " + var);
		test1(10);
		test2();
		test3();
	}
	
	
	public static void test1(int a) {
		System.out.println("In test1 method 1st instance: " +var);
		var = var  +100; //100
		System.out.println("In test1 method 2nd instance: " +var);
	}
	
	public static void test2() {
		System.out.println("In test2 method 1st instance: " +var);
		var = var  +500;
		System.out.println("In test2 method 2nd instance: " +var);
	}
	
	public static void test3() {
		if(true) {
			System.out.println("In if block: " + var);
			var = var -500;
		}
		System.out.println("Outside If block: " +var);
	}

}
