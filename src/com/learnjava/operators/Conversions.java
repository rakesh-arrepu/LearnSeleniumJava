package com.learnjava.operators;

public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		explicitConversionString();
		charToInt();
	}

	public static void implicitConversion(){
//		byte -> short -> char -> int -> long -> float -> double 
		
		int a = 10;
		
		//conversion of Int to Long done Automatically
		long b = a;
		
		//conversion of Long to double done Automatically
		double c = a;
		
		System.out.println("The value of Integer - " + a);
		System.out.println("The value of Long - " + b);
		System.out.println("The value of Double - " + c);
		
	}
	
	public static void explicitConversion() {
		// double -> float -> long -> int -> char -> short -> byte  
		
		double d = 10.23456;
		
		float f = (float)d;
		
		int i = (int)f;
		
		System.out.println("The value of Double - " + d);
		System.out.println("The value of Float - " + f);
		System.out.println("The value of Int - " + i);
	}
	
	
	public static void explicitConversionString() {

		// Convert Integer to String
		int a =10;
		String s = String.valueOf(a);
		
		System.out.println("The Integer value of a - " +a);
		System.out.println("Integer converted to String - " +s);
		
		
		//Convert String to Integer
		String s1 = "100";
		int a1 = Integer.parseInt(s1);
		System.out.println("The String value of s1 - " +s1);
		System.out.println("String converted to Integer - " +a1);
		
	}
	
	public static void charToInt() {
		char ch = '+';
		int i = (int) ch;
		System.out.println("The integer value of char - " + ch + " is : "+ i);
	}
}
