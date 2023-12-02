package com.learnjava.abstraction;

public class SBI extends Bank{

	void getInterest() {
		System.out.println("SBI interest is called");
		
	}
	
	
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.getInterest();
	}

	
}
