package com.learnjava.encapsulation;

public class ReadOnly {
	
	
	 private int n=100;
	 private String name="JOhn";
	
	public int getN() {
		return n;
	}
	
	public String getName() {
		return name;
	}

	
	public final static double pi = 3.1456;
	public final static double log2 = 1.638;
	
	
	public static final String msgSuccess = "SUCCESSFULLY DELIVERED!";
	

}
