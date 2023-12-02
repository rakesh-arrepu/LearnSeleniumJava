package com.learnjava.object;

public class SingleObject {
	
	
	int i; //Instance variable
	int j;
	String s;
	float f;

	
	
	public static void main(String[] args) {
		
		Class1 objClass1 = new Class1();
		
		SingleObject obj = new SingleObject();
		obj.i = 10;
		System.out.println("Obj" + obj.i);
		obj.j= 12;
		System.out.println("Obj" + obj.j);
		obj.s = "String";
		System.out.println("Obj" + obj.s);
		obj.f = 10.9f;
		System.out.println("Obj" + obj.f);
		
		
		SingleObject obj2 = new SingleObject();
		obj.i=11;
		System.out.println("Obj  modified" + obj.i);
		obj2.i = 1100;
		System.out.println("Obj1" + obj2.i);
		obj2.j= 1233;
		System.out.println("Obj1" + obj2.j);
		obj2.s = "Java";
		System.out.println("Obj1" + obj2.s);
		obj2.f = 244.92f;
		System.out.println("Obj1" + obj2.f);
	}

}
