package com.learnjava.staticExample;

public class Counter {
	
	
	static int  i =0; //Static variable
	int j=0; // Instance Variable
	
	Counter(){
		i++;
		System.out.println("The value of i - "+ i);
		j++;
		System.out.println("The value of j - "+ j);
	}
	
	public void display() {
		
	}

}

