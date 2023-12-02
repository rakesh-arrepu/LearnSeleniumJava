package com.learnjava.staticExample;

public class Student {

	String name;
	int roll;
	static int marks;

	void printStudentInfo() {
		System.out.println("The name of the student is : " + this.name + " having Id: " + this.roll);
	}

	static void initiate() {
		System.out.println("This is Static method. NO Object creation is required");
	}
	
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

}
