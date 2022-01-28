package weeek1.day2;

public class Factorial {

	// TODO Auto-generated method stub

	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	

	public static void main(String[] args) {

		// Declare your input as 5
		int a = 8;


		// Declare an integer variable fact as 1
		int fact = 1;

		// Iterate from 1 to your input (tip: using loop concept)
		for(int k=1;k<=a;k++) {
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			fact = fact*k;

		}//End of loop

		// Print factorial (fact)
		System.out.println("Factorial of " + a + "is " + fact  );

	}

}


