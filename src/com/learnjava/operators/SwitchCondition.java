package com.learnjava.operators;

public class SwitchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exampleSwitch("WED");

	}

	public static void exampleSwitch(String day) {
		switch (day) {
		case "SUN":
			System.out.println("SUNDAY");
//			break;
		case "MON":
			System.out.println("MONDAY");
//			break;
		case "TUE":
			System.out.println("TUESDAY");
//			break;
		case "WED":
			System.out.println("WEDNESDAY");
//			break;
		case "THU":
			System.out.println("THURSDAY");
			break;
		case "FRI":
			System.out.println("FRIDAY");
			break;
		case "SAT":
			System.out.println("SATURDAY");
			break;
		default:
			System.out.println("Invalid DAY pased");
		}
	}

	public static void caseChecker(int n) {
		switch (n) {
		case 1: {
			System.out.println("ODD");
			break;
		}
		case 4: {
			System.out.println("EVEN");
			break;
		}
		default:
			System.out.println("out of range");
		}
	}
}
