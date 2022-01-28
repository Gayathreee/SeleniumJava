package weeek1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Check number of occurrences of a char (eg 'e') in a String
		
					String str = " e e welcome to chennai";

					// declare and initialize a variable count to store the number of occurrences
					int numberOfOccurance =0;
					
					char charToBeChecked = 'e';
					
					// convert the string into char array
					char[] arrStr = str.toCharArray();
						
					//get the length of the array	
					
					// traverse from 0 till the array length 
					for(int iterator =0;iterator<=arrStr.length-1;iterator++) {
						
						// Check the char array has the particular char in it 
						
						if(arrStr[iterator] == charToBeChecked) {
							// if is has increment the count
							numberOfOccurance++;
						}						
						
					}
					// print the count out of the loop
					System.out.println(numberOfOccurance + " times character " + charToBeChecked + " occurs in the String: " + str);
	
	}

}
