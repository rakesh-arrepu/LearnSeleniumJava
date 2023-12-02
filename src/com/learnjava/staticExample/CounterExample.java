package com.learnjava.staticExample;

public class CounterExample extends Counter{

	
	
	public static void main(String[] args) {
		Counter c = new Counter();// i=1 j=1
		
		Counter c1 = new Counter();// i=2 j=1
		Counter c2 = new Counter(); // i=3 j=1
		
		//Normal Method & Object Intialization
		Student s = new Student("Doe", 345);
		s.printStudentInfo();
		s.roll = 10992;
		
		//Static Method & Static Variable Intialization
		Student.initiate();
		Student.marks = 45;
	}
}
