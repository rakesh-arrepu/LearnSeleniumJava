package com.learnjava.exceptions;

public class ExampleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		try {
//			int n=10;
//			int res = n/0;
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("Exception got thrown");
//		}
		
		
		
//		try {
//			String s = null;
//			int len = s.length();
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println("Exception got thrown");
//		}
		
//		try {
//			int[] arr = {1,2,3};
//			int num = arr[4];
//		} catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("Exception got thrown");
//		}
//		
		
//		try {
//			String s= "12";
//			int n = Integer.parseInt(s);
//		} catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("Exception got thrown");
//		} finally {
//			System.out.println("Finally Executed");
//		}
		convertStringToInteger();
		
	}
	
	
	public static void convertStringToInteger() throws NumberFormatException{
		String s= "as";
		int n = Integer.parseInt(s);
		System.out.println(s);
	}

}
