package com.learnjava.object;

public class TestClass {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Intiailizing values to the variables via object for Class Name- Class1
		Class1 objClass1 = new Class1(); // objClass1 - ref variable
		
		objClass1.num1 = 10;
		System.out.println(objClass1.num1);
		
		objClass1.num2 = 20;
		System.out.println(objClass1.num2);
		
		
		int res = objClass1.num1  + objClass1.num2;
		System.out.println(res);
		
		
		
		
		//Intiailizing values to the variables via object for Class Name- Class1
		Class2 objClass2 = new Class2(); // objClass2 - ref variable
		
		objClass2.num1 = 210;
		System.out.println(objClass2.num1);
		
		objClass2.num2 = 120;
		System.out.println(objClass2.num2);
		
		
		int res1 = objClass2.num1  + objClass2.num2;
		System.out.println(res1);
		
		
		
		
		//We can create multiple objects of a class in another class
		
		// We cna create objects of multiple classes in a single class
		
		
	}
	
	void test1() {
		Class1 objClass1 = new Class1();
	}

}
