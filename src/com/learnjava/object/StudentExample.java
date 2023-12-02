package com.learnjava.object;

public class StudentExample {
	
	
	public static void main(String[] args) {
		Student s = new Student("John", 234, 35.3f);
		Student s1 = new Student("John");
		
//		s.setName("John");
//		String name = s.getName();
//		System.out.println(name);
//		
//		s.setId(43546);
//		int id = s.getId();
//		System.out.println(id);
//		
//		s.setMarks(345);
//		float marks = s.getId();
//		System.out.println(marks);
		s.printStudentInfo();
		
		
		
	}
	
	

}
