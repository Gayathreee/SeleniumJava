package weeek1.day2;

public class PrimeNumbers {

	// TODO Auto-generated method stub

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */



	public static void main(String[] args) {

		// Declare an int Input and assign a value 13
		int inputNumber = 13;
		int remainder;


		// Declare a boolean variable flag as false
		boolean flag = true;


		// Iterate from 2 to half of the input
		for(int iterator =2 ;iterator<=inputNumber/2;iterator++) {


			// Divide the input with each for loop variable and check the remainder
			remainder = inputNumber%iterator;


			// Set the flag as true when there is no remainder
			if(remainder == 0) {
				flag = false;
				// break the iterator

			}

		}
		// Check the flag (Provide a condition)

		if(flag ) {
			// Print 'Prime' when the condition matches
			System.out.println(inputNumber + "is Prime");

		}else {
			// Print 'Not a Prime' when the condition doesn't match 
			System.out.println(inputNumber + "is not Prime");
		}
	}
}



