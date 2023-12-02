package com.learnjava.operators;

public class MultiOperators {

    public static void main(String[] args){
      arithmeticOperators();
        areaOfRectangle(3, 2);
        areaOfRectangle(1, 5);
        areaOfRectangle(10, -2);

        // - Single Line Comment


        // int is a subset of Long

        int diameter = getDiameter(10);
        double area_circle = areaOfCircle(diameter);
        System.out.println("Area of Circle: "+ area_circle);
    }

    public static void arithmeticOperators(){
        int a = 1;
        int b = 2;
        int total = a+b;
        System.out.println(total);
    }

    public static void areaOfRectangle(int length, int width){
        if(length > 0 && width > 0) {
            int area = length * width;
            System.out.println("The area of Rectangle having inputs as Length - " + length + " Width - " + width + " is : " + area);
        } else {
            System.out.println("Error.......Invalid inputs");
        }
    }

    public static int getDiameter(int radius){
        int diameter = 2 * radius;
        return diameter;
    }

    public static double areaOfCircle(int diameter){
        int radius = diameter/2;
        double areaOfCircle = 3.14*radius*radius;
        return areaOfCircle;
    }


    public void compartiveOperators(){
       //  < , >, <=, >=
        // Logical Operators && ||


    }
    
    
    
    public int testMethod(int a, int b ) {
    	//
    	//
    	return a;
    }
    
    
    public char test2() {
    	char ch = 'a'; //local
    	
    	//
    	//
    	
    	
    	return ch;
    }
    
    
    
    
    
    
}
