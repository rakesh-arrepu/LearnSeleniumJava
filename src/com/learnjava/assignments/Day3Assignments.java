package com.learnjava.assignments;

public class Day3Assignments {

	public static void main(String[] args) {
		System.out.println(diff(40,10,12));
	}
	
/*	1. Write a program to determine Highest & Lowest of the 3 numbers and return difference of the highest & lowest.
			Input: 10,20,40    || Output: 30
			Input: 230,120,645 || Output: 525 */
	
	public static int diff(int n1, int n2, int n3) {
		int max=0;
		int min=0;
		
		//To determine highest number of 3 integers
		if(n1>n2 && n1>n3) {
			max = n1;
		} else if(n2 > n3) {
			max = n2;
		} else {
			max = n3;
		}
		
		//To determine Lowest number of 3 integers
		if(n1<n2 && n1<n3) {
			min = n1;
		} else if(n2 < n3) {
			min = n2;
		} else {
			min = n3;
		}
		return max-min;
	}

/*	2. Perform Explicit Conversions for the below data types.
	Double -> Long -> int */
	public static void doExplicitConversion() {
		double d = 100484.098;
		long l = (long) d;
		int i = (int) l;
		
		System.out.println("The value of Double - " + d);
		System.out.println("The value of Long - " + l);
		System.out.println("The value of Int - " + i);
		
		// double -> float -> long -> int -> char -> short -> byte  

		double d1 = 10.23456;
		float f1 = (float)d1;
		int i1 = (int)f1;
		
		System.out.println("The value of Double - " + d1);
		System.out.println("The value of Float - " + f1);
		System.out.println("The value of Int - " + i1);
	}
	
/*	3. Write a method which accepts 2 arguments: (int & long) and perform addition and return in String
			Input: 145, 54545 || Output: "54400"( should be in String) */
	public static String addition(int i, long l) {
		long sum = i+l;
		return String.valueOf(sum);
	}
	
/*	4. Write a switch statement to determine the input is Vowel or not
	Note: vowels are - a,e,i,o,u
	Input: 'a' || Output: Vowel
	Input: 'u' || Output: Vowel
	Input: 'w' || Output: Constant */
	public static String isVowel(char c) {
		String out = "";
		switch (c) {
		case 'a':  out = "Vowel";
		case 'e':  out = "Vowel";
		case 'i':  out = "Vowel";
		case 'o':  out = "Vowel";
		case 'u':  out = "Vowel";
		
		default:
			out = "Constant";
		}
		
		return out;
	}
	
/*	5. Create a function that takes three numbers — the width and height of a rectangle, and the radius of a circle — and returns true 
	   if the rectangle can fit	inside the circle, false if it can't.
		rectangleInCircle(8, 6, 5) ➞ true
		rectangleInCircle(5, 9, 5) ➞ false
		rectangleInCircle(4, 7, 4) ➞ false */
	public static boolean rectangleInCircle(int width, int height, int radius) {
		double areaRectangle = width * height;
		double areaCircle = 2 * 3.14 * radius;
		if(areaRectangle < areaCircle)
			return true;
		return false;
	}
	
	
	
	
	
}
