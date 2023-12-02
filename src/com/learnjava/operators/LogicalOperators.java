package com.learnjava.operators;

public class LogicalOperators {

    public static void main(String[] args) {
//        logicalAnd();
//        logicalOr();
        qualifiedForVote(10);
        qualifiedForVote(70);
        qualifiedForVote(34);
    }

    // = assignment
    // == equality operator
    // != not equals
    public static void logicalAnd(){
        System.out.println( (5 > 3) && (3>2));  // True | True | True
        System.out.println( (3 == 3) && (3<3)); // True | False | False
        System.out.println( (5 > 5) && (2<=2)); // False | True | False
        System.out.println( (5 != 3) && (3 ==2)); // True | False | False
    }

    public static void logicalOr(){
        System.out.println( (5 > 3) || (3>2));  // True | True | True
        System.out.println( (3 == 3) || (3<3)); // True | False | True
        System.out.println( (5 > 5) || (2<=2)); // False | True | True
        System.out.println( (5 != 5) || (3 ==2)); // False | False | False
    }


    public  static void qualifiedForVote(int age){

//        age > 18 && age <60;

        if(age > 18) {
            if(age < 60) {
                System.out.println("Qualified");
            } else {
                System.out.println("OLDER");
            }
        } else {
            System.out.println("Minor");
        }

        if( age > 18 && age < 60) {
            System.out.print("Qualified");
        } else {
            System.out.println("Not Qualified");
        }

        int $code = 12;


    }

}
