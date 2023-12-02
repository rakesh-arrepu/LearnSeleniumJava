package com.learnjava.staticExample;

import com.leanrjava.variable.Scope;
//import com.learnjava.assignments.Day5Assignments;
import com.learnjava.assignments.Day5Assignments;

public class CounterExample extends Counter{

	
	
	public static void main(String[] args) {
		Counter c = new Counter();// i=1 j=1
		
//		Counter c1 = new Counter();// i=2 j=1
//		Counter c2 = new Counter(); // i=3 j=1
		
//		//Normal Method & Object Intialization
//		Student s = new Student("Doe", 345);
//		s.printStudentInfo();
//		s.roll = 10992;
//		
//		//Static Method & Static Variable Intialization
//		Student.initiate();
//		Student.marks = 45;
//		
//		
//		
//		Scope.localVar();
		
		Day5Assignments.numberSplit(20);
	}
}
