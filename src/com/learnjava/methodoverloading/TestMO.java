package com.learnjava.methodoverloading;

public class TestMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(5);
		method1(5, 10);
		
		
		method2(1,2);
		method2(1.4f, 2.6f);
	}
	
	
	//Diff in NO Of Arguments of same data type
	public static void method1(int a, int b) {
		System.out.println("Method 1 with 2 Integer arguments is called");
	}
	
	public static void method1(int a) {
		System.out.println("Method 1 with 1 Integer arguments is called");
	}
	
	
	//Diff in data type having same number of arguments
	public static void method2(int a, int b) {
		System.out.println("Method 1 with 2 Integer arguments is called");
	}
	
	public static void method2(float a, float b) {
		System.out.println("Method 1 with 2 Float arguments is called");
	}
	
	
	

}
