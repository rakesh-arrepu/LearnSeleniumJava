package com.learnjava.arrays;

public class ExampleArrays {

	
	public static void main(String[] args) {
		
		int var=2;
		for(int i=1;i<=var;i++) {
			System.out.println(i);
		}
		
		
		
//		int[] nums= {100,200,300};
		int[] noValues = new int[10];

		int[] returnArray = initializeArray(noValues);
//		printArray(returnArray);
	}
	
	
	
	
	public static void readValuesInArray(int[] arr, int index) {
		int len = arr.length;
		System.out.println("THE VALUE OF ARRAY AT INDEX: " +index + "is: " + arr[index]);
	}
	
	public static int[] initializeArray(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len;i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len;i++) {
			System.out.println("The value of array at index- " + i + " is: "+arr[i]);
		}
	}
	
}
