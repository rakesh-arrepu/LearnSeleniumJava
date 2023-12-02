package com.learnjava.accessModifiers;

public class PrivateModifiers {

	private int num = 10;
	
	private void displayNumber() {
		System.out.println("Number is - "+ num);
	}
	
	public void displayText() {
		System.out.println("This is a public method");
	}

}
