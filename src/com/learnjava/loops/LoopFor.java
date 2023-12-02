package com.learnjava.loops;

import java.util.ArrayList;
import java.util.List;

public class LoopFor {

	public static void main(String[] args) {
//		continueExample(5);
		List<String> lst = new ArrayList(0);
		lst.add("john");
		lst.add("Jacob");
		if(lst.contains("john"))
				System.out.println("John is in list");
	}

	public static void forLoopExample(int n) {

		for (int i = 0; i<=n; i++) {
			if (i % 2 == 0)
				System.out.println(i + " is Even Number");
			else
				System.out.println(i + " is Odd Number");
		}
	}
	
	public static void whileLoopExample(int n) {
		int i=10;
		while(i<=n) {
			if (i % 2 == 0)
				System.out.println(i + " is Even Number");
			else
				System.out.println(i + " is Odd Number");
			i++;
		}
	}
	
	public static void doWhileLoopExample(int n) {
		int i=10;
		do {
			if (i % 2 == 0)
				System.out.println(i + " is Even Number");
			else
				System.out.println(i + " is Odd Number");
			i++;
		} while(i<=n);
		
		System.out.println("This is end of loop");
		
	}
	
	
	public static void breakExample(int n) {
		// continue --  break
		
		//break
		
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			if(i == n)
				break;
		}
		System.out.println("Break");
		
	}
	
	public static void continueExample(int n) {
		// continue
		
		for(int i=1; i<=10;i++) {
			if(i == n)
				continue;
			System.out.println(i);
			
		}
		System.out.println("Continue");
		
	}

}
