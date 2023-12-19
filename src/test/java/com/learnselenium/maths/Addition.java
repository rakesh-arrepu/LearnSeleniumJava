package com.learnselenium.maths;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Addition {
	
	
	@Parameters({"number1", "number2"})
	@Test
	public void add(int a, int b) {
		int result = a+b;
		System.out.println("Add: "+ result);
	}
	
	@Parameters({"number1", "number2"})
	@Test
	public void subtract(int a, int b) {
		int result = a-b;
		System.out.println("Subtract: "+ result);
	}

}
