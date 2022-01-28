package weeek1.day2;

import java.util.Arrays;

public class Anagram {

	/*
	 * Pseudo Code
	  
	 *Declare a String 
	  String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
	
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length() == text2.length()) {
			char[] arrText1 = text1.toCharArray();
			char[] arrText2 = text2.toCharArray();
			Arrays.sort(arrText1);
			Arrays.sort(arrText2);
			text1 = String.valueOf(arrText2);
			text2 = String.valueOf(arrText2);
			if(text1.equals(text2)) {
				System.out.println("Both the string has same characters");
			}
		}
	}
	
}
