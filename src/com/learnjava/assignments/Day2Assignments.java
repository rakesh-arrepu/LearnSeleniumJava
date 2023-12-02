package com.learnjava.assignments;

import java.text.DecimalFormat;

public class Day2Assignments {

	public static void main(String[] args) {
//		System.out.println(actualMemorySize("32GB"));
//		System.out.println(actualMemorySize("1GB"));
//		System.out.println(actualMemorySize("512MB"));
	
//		System.out.println(isSpyNumber(1124));
//		System.out.println(isSpyNumber(246));
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
	public static boolean isRightAngleTriangle(int a, int b, int h) {
		if(h*h == (a*a) + (b*b))
			return true;
		return false;
		
	}
	
/*	7. Create a function that takes a number and returns true if the number is automorphic, false if it isn't
	A number n is automorphic if n^2 ends in n.
	For example: n=5, n^2=25
	isAutomorphic(5) ➞ true
	isAutomorphic(8) ➞ false */
	public static boolean isAutomorphic(int n) {
		double result = Math.pow(n, 2) ;
		int res = (int) result;
		int lastDigitResult = res % 10;
		int lastDigitNumber = n % 10;
		if(lastDigitResult == lastDigitNumber)
			return true;
		return false;
	}
	
/*	8. Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size
	Examples:
	actualMemorySize("32GB")  ➞ "29.76GB"
	actualMemorySize("2GB")   ➞ "1.86GB"
	actualMemorySize("512MB") ➞ "476MB"
	Notes:
	The actual storage loss on a USB device is 7% of the overall memory size!
	If the actual memory size was greater than 1 GB, round your result to two decimal places.
	If the memory size after adjustment is smaller then 1 GB, return the result in MB.
	For the purposes of this challenge, there are 1000 MB in a Gigabyte. */
	public static String actualMemorySize(String memory) {
		String result = "";
	    final DecimalFormat gbFormat = new DecimalFormat("0.00"); // Format upto 2 decimals of double
	    final DecimalFormat mbFormat = new DecimalFormat("0"); 
		double size = Double.parseDouble(memory.substring(0, memory.length()-2));
		double actualSize = size - size*(7d/100d); //7 % of memory gives actual
		
		if(memory.contains("GB")) {
			double mbSize = actualSize * 1000;
			if(mbSize < 1000)
				result = mbFormat.format(mbSize)+"MB";
			else
				result = gbFormat.format(actualSize)+"GB";
			
		} else if(memory.contains("MB")) {
			result = mbFormat.format(actualSize)+"MB";	
		}
		
		return result;
	}
	
/*	9. Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.
	Examples:
	equal(3, 4, 3) ➞ 2
	equal(1, 1, 1) ➞ 3
	equal(3, 4, 1) ➞ 0

	Notes:
	Your function must return 0, 2 or 3 */
	public static int equal(int a, int b, int c) {
		if((a==b && a==c) || (b==c && b==a) || (c==a && c==b))
			return 3;
		else if(a==b || b==c || c==a)
			return 2;
		else return 0;
	}
	
/*	10. Write a program to determine whether a number is SPY number or not
	Spy Number:
	A positive integer is called a spy number if the sum and product of its digits are equal. In other words, a number whose sum and product of all digits are equal is called a spy number.

	Example of Spy Number
	Let's take the number 1124 and check whether the number is a spy or not. First, we will split it into digits (1, 1, 2, 4). After that find the sum and product of all the digits.

	Sum=1+1+2+4=8
	Product=1*1*2*4=8

	Input: 1124 || Output: true (1+1+2+4 = 8 == 1*1*2*4= 8)
	Input:  246 || Output: true (2+4+6  = 12 != 2*4*6 = 48) */
	public static boolean isSpyNumber(int num) {
		int sum=0;
		int product=1;
		while(num > 0) {
			int r = num % 10;
			num= num/10;
			sum = sum+r;
			product = product*r;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Product: "+product);
		
		if(sum == product)
			return true;
		return false;
	}
	
}
