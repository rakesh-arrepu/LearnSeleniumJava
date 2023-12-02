package com.learnjava.strings;

public class ExamplesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		1. By Literal
		String demo = "Hello";
		
//		2. By New Keyword
//		String s1 = new String("World");
		
		char[] cArray = {'j','a','v','a'};
		//Explicit Conversion of Char Array to String
		String newString = new String(cArray);
//		System.out.print(newString);
		
		
		//Char At
//		System.out.println(demo.charAt(0));
		
		//toLower
//		String strUpperCase = "ToDay iS FriDay";
//		System.out.println(strUpperCase.toLowerCase());
		
		
		String strLowerCase = "ToDay iS FriDay";
//		System.out.println(strLowerCase.toUpperCase());
		
		
		String s1 = "One";
		String s2 = "Two";
//		System.out.println(s1.concat(s2));
//		System.out.println(s1+s2);
		
		String msg = "The order Id: FWS85433 is delievered successfully";
//		if(msg.contains("delievered successfully"))
//			System.out.println("PASS");
//		else
//			System.out.println("FAIL");
//		
		
		String normalMessage = "The order is placed";
//		if(normalMessage.equals("The order is placeD"))
//			System.out.println("PASS");
//		else
//			System.out.println("Fail");
		
		String expected = "Order is Shipped";
		String actual = "order is shipped";
//		if(expected.toLowerCase().equals(actual))
//			System.out.println("PASS");
//		else
//			System.out.println("Fail");
		
		
//		if(expected.equalsIgnoreCase(actual))
//			System.out.println("PASS");
//		else
//			System.out.println("Fail");
		
		String left = "  Order      is   Shipped        ";
//		System.out.println(left.replaceAll(" ", ""));
//		System.out.println(left.length());
//		System.out.println(left);
//		String leftTrim = left.trim();
//		System.out.println(leftTrim);
//		System.out.println(leftTrim.length());
		
		String s23 = "Polo";
//		System.out.println(s23.replace('o', 'l'));
		
		String ls = "This is a String";
		String[] splitArray = ls.split(" ");
		for(String str : splitArray){
			System.out.println(str);
		}
		
		for(int i=0;i<splitArray.length;i++){
			System.out.println(splitArray[i]);
		}
		
		String order = "The order id: B65FG5";
		String orderId = order.split(":")[1];
		System.out.println(orderId.trim());
//		String left2 = "LEFT";
//		if(left.trim().equals(left2))
//			System.out.println("PASS");
//		else
//			System.out.println("FAIL");
		
		System.out.println(order.indexOf("id"));
		
	
		
	}

}
