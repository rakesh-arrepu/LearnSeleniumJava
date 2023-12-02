package com.leanrjava.variable;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		localVar();
		localVar2();
	}
	
	
	public static void localVar() {
		//method scope
		int local = 10;
		System.out.println(local); //10
		
		local= 10 + local;
		System.out.println(local); //10 +10 = 20
		
		local = 100 + local;
		System.out.println(local); //100 +20 = 120
		
		if(true) {
			local = 1000 + local ;
			System.out.println(local); //1000 +120
		}
		
		System.out.println(local);
		
	}//- end point
	
	public static void localVar2() {
		//block scope
		int a =10;
		int b= 20;
		if(b>a) {
			int local = a+b+100; //10 +20 + 100 = 130 --  start point
			System.out.println(local);
		} // -- end point 
		int local = 20;
		System.out.println(local);
	
		
		if(a<b) {
			local = local +10;
			System.out.println(local);
		}
	}

}
