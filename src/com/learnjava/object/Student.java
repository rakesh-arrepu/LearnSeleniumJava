package com.learnjava.object;

public class Student {
	
	String name;
	int id;
	float marks;
	
	
//	//Rules of creating Constructor
//	
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public float getMarks() {
//		return marks;
//	}
//
//
//	public void setMarks(float marks) {
//		this.marks = marks;
//	}

	
	void printStudentInfo() {
		System.out.println("The name of the student is : " + this.name +" having Id: " + this.id+" got marks - "+ this.marks);
	}


public Student(String name, int id, float marks) {
	super();
	this.name = name;
	this.id = id;
	this.marks = marks;
}

public Student(int id, float mark, String name) {
	super();
	this.name = name;
	this.id = id;
	this.marks = marks;
}

public Student(String name) {
	super();
	this.name = name;
}


public Student(int id) {
	super();
	this.id = id;
	System.out.println("In Object package and value of id-"+id);
}

//Construcotr Overloading



//	//no-args Constructor
//	Student(){
//		System.out.println("Default constructor is called");
//	}
//	
//	
	//parameterized Constructor
//	Student(String name, int id, float marks) {
//		this.name = name;
//		this.marks=marks;
//		this.id=id;
//		System.out.println("The name of the student is : " + name +" having Id: " +id+" got marks - "+ marks);
//	}


	
	

}
