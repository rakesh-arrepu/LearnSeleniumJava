package com.learnjava.inheritancemultilevel;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		
		c.testChild();
		c.testFather();
		c.testGrandFather();
		
		
		Father f = new Father();
		f.testFather();

	}

}
