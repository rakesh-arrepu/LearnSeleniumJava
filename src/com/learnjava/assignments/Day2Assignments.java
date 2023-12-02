package com.learnjava.assignments;

public class Day2Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	1. Write a program to find the sum of n natural numbers
	public static void sumNaturalNumbers(int n) {
		int sum = n*(n+1)/2;
		System.out.println("The sum of " +n+ " Natural numbers is: " + sum);
	}
	
//	2. Write a program that converts hours into seconds & minutes into seconds
	public static void convertSeconds(int duration, String time) {
		int seconds=0;
		if(time.equalsIgnoreCase("hours"))
			seconds = duration * 60 * 60;
		else if(time.equalsIgnoreCase("minutes"))
			seconds = duration * 60;
		System.out.println(duration+" "+time + "converted to seconds is -"+seconds);
	}
	

//3. Write a program to check the number is Even or Odd
	public static void isOddOrEven(int n) {
		if(n%2 == 0)
			System.out.println(n+" is a EVEN Number");
		else if(n%2 != 0)
			System.out.println(n+" is a ODD Number");
	}
	
//	4. 	Write a program to return a string last appended with "LearnJava"
	public static String appendText(String str) {
		return str+"LearnJava";
	}
	
//	5. Write a program to reproduce a Basic Calculator with all arithmetic operators
	public static void simpleCalculator(int num1, int num2, char operator) {
		int result=0;
		if(operator == '+')
			result = num1 + num2;
		else if(operator == '-')
			result = num1 - num2;
		else if(operator == '*')
			result = num1 * num2;
		else if(operator == '/')
			result = num1 / num2;
		else if(operator == '%')
			result = num1 % num2;
	}
	
//	6. Write a program to check the given sides are Right Angle triangle
	public static void isRightAngleTriangle(int a, int b, int h) {
		if(h*h == (a*a) + (b*b))
			System.out.println("Right Ange=le ");
		
	}
	
	
}
