package com.learnjava.assignments;

import java.util.regex.Pattern;

public class Day5Assignments {

	public static void main(String[] args) {
//		System.out.println(highestNumberInArray(new int[] {21, 45, 9}));
//		System.out.println(highestNumberInArray(new int[] {0, -45, 9}));
//		System.out.println(highestNumberInArray(new int[] {0, -45, -9}));
//		System.out.println(highestNumberInArray(new int[] {-10, -45, -9}));
	
//		String a  = "Today is Sunday";
//		String extract = a.substring(0, 5);
//		System.out.println(extract);
				
//		filterStateNames(new String[] {"Arizona", "CA", "NY", "Nevada"}, "abb");
//		System.out.println(checkEnding("abc", "d"));

//		System.out.println(findZip("all zip files are zipped"));
//		System.out.println(findZip("all zip files are compressed"));
//		System.out.println(findZip("zip zip files zip zipped zip"));
		
//		numberSplit(100);
//		System.out.println(reverseCase("MaNy THaNkS"));
		
//		System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
		
//		System.out.println(sayHelloBye("John", -1));
		
//		calculateScores("A");
		
		getFlightNumbers("The scheduled flights are: B5743, B7393, C9373");
		
		
	}

	
/*	1. Write a program to count of input character present in a String
	Note: Take a String "Hello World". Print number of occurances of character 'l' as Output: 3
	This method should have 2 inputs. 
	charCount(String s, char c) -> Output: integer

	Exmaples:
	charCount("hello world", 'l') -> 3
	charCount("I am learning Java", 'a') -> 4 */
	
	public static int charCount(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				count++;
		}
		return count;
	}
	
/*	2. Create a function that takes a string and returns a new string with its first and last characters swapped, except under two conditions:
		If the length of the string is less than two, return "Incompatible.".
		If the first and last characters are the same, return "Two's a pair.".

		Examples
		flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"
		flipEndChars("ada") ➞ "Two's a pair."
		flipEndChars("Ada") ➞ "adA"
		flipEndChars("z") ➞ "Incompatible." */
	public static String flipEndChars(String s) {
		String out = "";
		if(s.length()<2) 
			out = "Incompatible.";
		else {
			if(s.charAt(0) == s.charAt(s.length()-1))
				out = "Two's a pair.";
			else {
				out = String.valueOf(s.charAt(s.length()-1))
					  + s.substring(1, s.length()-1)
					  + String.valueOf(s.charAt(0));
			}
		}
		return out;
	}
	
/*	4. Create a function to find the Highest Number in Array
	highestNumberInArray([21, 45, 9])  -> 45
	highestNumberInArray([0, -2, -87]) -> 0
	highestNumberInArray([-10, -2, -87]) -> -2 */	
	public static int highestNumberInArray(int[] arr) {
		int highest = arr[0];
//      >>>>>Solution 1 using Enhanced For Loop<<<<<
		for(int num: arr) {
			if( num > highest)
				highest = num;
		}
		
//      >>>>>Solution 2 using Normal For Loop<<<<<
//		for(int i=1; i<arr.length;i++) {
//			if(arr[i]>highest) {
//				highest = arr[i];
//			}
//		}
		
		return highest;
	}
	
/*	 5. Given a number, return a list containing the two halves of the number. If the number is odd, make the rightmost number higher.
			Examples
			numberSplit(25) ➞ [12, 13]
			numberSplit(10) ➞ [5, 5]
			numberSplit(-9) ➞ [-5, -4] */
	public static void numberSplit(int n) {
		int num1 = 0;
		int num2 = 0;
		if(n%2 == 0) {
			num1 = num2 = n/2;
		} else {
			num1 = n/2;
			num2 = n/2+1;
		}

		System.out.println(num1+","+num2);
	}

/*  6. Given a string, create a function to reverse the case. All lower-cased letters should be upper-cased, and vice versa.
	Examples
	reverseCase("Happy Birthday") ➞ "hAPPY bIRTHDAY"
	reverseCase("MANY THANKS") ➞ "many thanks" */
	public static String reverseCase(String s) {
		StringBuilder sb = new StringBuilder();
		for(char c: s.toCharArray()) {
			if(Character.isUpperCase(c))
				sb.append(String.valueOf(c).toLowerCase());
			else if(Character.isLowerCase(c))
				sb.append(String.valueOf(c).toUpperCase());
			else
				sb.append(c);
		}
		return sb.toString();
	}
	
	
/*   7. Write a function that returns the position of the second occurrence of
	  "zip" in a string, or -1 if it does not occur at least twice. Your code
	  should be general enough to pass every possible case where "zip" can occur in
	  a string.
	  Examples findZip("all zip files are zipped") ➞ 18
	  findZip("all zip files are compressed") ➞ -1 */
	public static int findZip(String s) {
		if(s.contains("zip")) {
			String[] arrZip = s.split("zip");
			if(arrZip.length>2) {
				return s.lastIndexOf("zip");
			}	
		}
		return -1;
	}
	
/*	8. Create a function that takes an array and returns the difference between the biggest and smallest numbers.
	Examples
	differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
	differenceMaxMin([44, 32, 86, 19]) ➞ 67 */
	public static int differenceMaxMin(int[] arr) {
		int diff = 0;
		
		//To get Max number in array
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		
		//To get Min number in array
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		
		diff = max-min;
		return diff;
	}
	
/*	9.Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.
	Examples
	checkEnding("abc", "bc") ➞ true
	checkEnding("abc", "d") ➞ false
	checkEnding("samurai", "zi") ➞ false
	checkEnding("feminine", "nine") ➞ true */
	public static boolean checkEnding(String s1, String s2) {
		
//      >>>>>Solution 1<<<<<
//		int len = s2.length();
//		String extract = s1.substring(s1.length()-len, s1.length());
//		s1.endsWith(s2);
//		System.out.println(extract);
		
//	    >>>>>Solution 2<<<<<
		if(s1.endsWith(s2))
			return true;
		return false;
	}

/*	10. Write a function that takes a string name and a number num (either 0 or 1) and return "Hello" + name if num is 1, otherwise return "Bye" + name.
	Examples
	sayHelloBye("alon", 1) ➞ "Hello Alon"
	sayHelloBye("Tomi", 0) ➞ "Bye Tomi"
	sayHelloBye("jose", 0) ➞ "Bye Jose" */
	public static String sayHelloBye(String name, int i) {
		if(i == 1)
			return "Hello " + name;
		return "Bye " + name;
	}
			
/*	11. Write a function that finds the word "bomb" in the given string (not case sensitive). Return "DUCK!" if found, otherwise,"Relax, there's no bomb."
	Notes: 
	The string "bomb" may appear in different character cases (i.e. uppercase, lowercase, mixed).

	Examples
	bomb("There is a bomb.") ➞ "DUCK!"
	bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"
	bomb("This goes boom!!!") ➞ "Relax, there's no bomb."	*/
	public static String bomb(String txt) {
		if(txt.toLowerCase().contains("bomb"))
			return "DUCK!";
		return "Relax, there's no bomb.";
	}
	
/*	12. Andy, Ben and Charlotte are playing a board game. The three of them decided to come up with a new scoring system. 
	A player's first initial ("A", "B" or "C") denotes that player scoring a single point. Given a string of capital letters, return an array of the players' scores.

	For instance, if ABBACCCCAC is written when the game is over, then Andy scored 3 points, Ben scored 2 points, and Charlotte scored 5 points, since there are 3 instances of letter A, 2 instances of letter B, and 5 instances of letter C. So the array [3, 2, 5] should be returned.

	Examples
	calculateScores("A") ➞ [1, 0, 0]
	calculateScores("ABC") ➞ [1, 1, 1]
	calculateScores("ABCBACC") ➞ [2, 2, 3] */
	public static int[] calculateScores(String str) {
		int[] arrOut = new int[3];
		int countA=0;
		int countB=0;
		int countC=0;
		
		for(char c: str.toCharArray()) {
			if(c == 'A')
				countA++;
			else if(c == 'B')
				countB++;
			else if(c == 'C')
				countC++;
			
		}
		arrOut[0] = countA;
		arrOut[1] = countB;
		arrOut[2] = countC;
		
		for(int i: arrOut) {
			System.out.print(i+" ");
		}
		return arrOut;
	}

/*	13. Create a function to print the individual flight numbers of the given string using split method
	Examples:
	getFlightNumbers("The scheduled flights are: B5743, B7393, C9373") -> [B5743, B7393, C9373] */
	public static void getFlightNumbers(String s) {
		String[] flights =  s.split(":")[1].split(",");
		for(String flight: flights) {
			System.out.println(flight.trim()+" ");
		}
	}
	
			
	public static boolean isValid(String zip) {
		boolean isZipValid = false;
		if (zip.length() == 5) {
			char[] arrZip = zip.toCharArray();
			int count = 0;
			for (char c : arrZip) {
				int val = (int) c;
				if (!(val >= 48 && val <= 57))
					count++;
			}
			if (count == 0)
				isZipValid = true;
		}
		return isZipValid;
	}

/*  14. Create a function to print whether a number is a Harshad or not.
    A number is said to be Harshad if it's exactly divisible by the sum of its digits. Create a function that determines 
	Examples
	isHarshad(75) ➞ false
	// 7 + 5 = 12
	// 75 is not exactly divisible by 12
	isHarshad(481) ➞ true
	isHarshad(89) ➞ false
	isHarshad(516) ➞ true */
	public static boolean isHarshad(int n) {
//      >>>>>Solution 1 using Enhanced For Loop & Char<<<<<
		char[] num = String.valueOf(n).toCharArray();
		int sum = 0;
		for (char c : num) {
			int digit = Integer.parseInt(String.valueOf(c));
			sum = sum + digit;
		}
		System.out.println(sum);
		if (n % sum == 0)
			return true;
		return false;

//      >>>>>Solution 2 using Normal For Loop & Mathematical Logic<<<<<
//		int sum=0;
//		int number = n;
//		for(sum=0; number!=0; number=number/10)  
//		{  
//		//finds the last digit and add it to the variable sum      
//		sum = sum + number % 10;  
//		}  
//		System.out.println(sum);
//		if( n % sum == 0)
//			return true;
//		return false;
	}

/*	15. Create a function that returns the average of an array composed of letters.
	Note:
	a = 1, b = 2, c = 3, d = 4 ,e = 5.....z = 26
	average = total sum of all numbers / number of item in the set
	Return the result rounded to two decimal points.
	Examples
	averageIndex(["f", "o", "r", "t", "h", "e", "l", "o", "v", "e", "o", "f", "t", "e", "s", "h"]) ➞ 12.44
	averageIndex(["m", "y", "t", "e", "s", "h"]) ➞ 15.0 */
	public static double averageIndex(String[] arr) {
		int sum = 0;
		for (String s : arr) {
			sum = sum + (int) s.charAt(0) - 96;
		}
		return sum / arr.length;
	}

/*	16. Create a function to determine whether the given array is Special Array or not. 
	Note:
	An array is special if every even index contains an even number and every odd index contains an odd number. Create a function that returns true if an array is special, and false otherwise.
	Examples
	isSpecialArray([2, 7, 4, 9, 6, 1, 6, 3]) ➞ true
	// Even indices: [2, 4, 6, 6]; Odd indices: [7, 9, 1, 3]
	isSpecialArray([2, 7, 9, 1, 6, 1, 6, 3]) ➞ false
	// Index 2 has an odd number 9. */
	public static boolean isSpecialArray(int[] arr) {
//      >>>>>Solution 1<<<<<
//		int evenCounter = 0, oddCounter = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (i % 2 == 0 && arr[i] % 2 == 0) {
//				evenCounter++;
//			} else if (i % 2 != 0 && arr[i] % 2 != 0) {
//				oddCounter++;
//			}
//		}
//		if (evenCounter + oddCounter == arr.length)
//			return true;
//		return false;

//      >>>>>Solution 2<<<<<
		for(int i=0;i<arr.length;i++)
			if(i%2!=arr[i]%2)
				return false;
		return true;
	}

/*	17. Create a function that creates the product IDs for the variety of fruit juices.
	Examples:
	getDrinkID("apple", "500ml") ➞ "APP500"
	getDrinkID("pineapple", "45ml") ➞ "PIN45"
	getDrinkID("passion fruit", "750ml") ➞ "PASFRU750" */
	public static String getDrinkID(String flavor, String ml) {
		String out = "";
		if (flavor.contains(" ")) {
			for (String each : flavor.split(" ")) {
				out += each.substring(0, 3).toUpperCase();
			}
		} else {
			out = flavor.substring(0, 3).toUpperCase();
		}
		return out + ml.replaceAll("ml", "");
	}
		
}
