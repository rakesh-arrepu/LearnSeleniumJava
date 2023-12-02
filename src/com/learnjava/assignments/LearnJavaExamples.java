package com.learnjava.assignments;

public class LearnJavaExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortedArray = sortArray(new int[] { 5, 2, 6, 1 });
//		printArray(sortedArray);
		
		
		
		
		System.out.println(Day5Assignments.flipEndChars("abcd"));
		
	}

	public static int[] sortArray(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++)
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		return arr;
	}
	
	public static void printArray(int[] res) {
		
		for(int n: res) {
			System.out.println(n);
		}
	}

}
