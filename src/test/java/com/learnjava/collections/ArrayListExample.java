package com.learnjava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.testng.Assert;

public class ArrayListExample {
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		set.add("Mango");
		set.add("Apple");
		set.add("apple");
		System.out.println("Set size: "+set.size());
		
		//Adding an object
		List<String> lst = new ArrayList<String>();
		if(lst.isEmpty()) {
		lst.add("Mango");
		lst.add("Mango1");
		lst.add("Apple");
		lst.add("Apple1");
		}
		
		
		String valAtFirstIndex = lst.get(1); //get By Index
		System.out.println("valAtFirstIndex- "+ valAtFirstIndex);
		
		//1st Check
		Assert.assertTrue(lst.contains("Mango"), " item is not present in the list");
		
		System.out.println("List size Before remove:"+lst.size());
		//print list
		printList(lst);
	
		//Remove an element
		lst.remove(0); //By index
		lst.remove("Apple"); //By Object/value
	
		
		System.out.println("List size After remove:"+lst.size());
		//print list
		printList(lst);
		
		
		lst.clear();
		System.out.println("List size After Clear remove:"+lst.size());
		
		Assert.assertTrue(lst.isEmpty(), "List is not Empty");
	}
	
	static void printList(List<String> list) {
		for(String l: list) {
			System.out.println(l);
		}
	}
	
	

}
