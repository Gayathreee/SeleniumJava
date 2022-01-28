package weeek1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;

				// Build the logic to find the count of each
				/* Pseudo Code:
					a) Convert the String to character array
					b) Traverse through each character (using loop)
					c) Find if the given character is what type using (if)
							i)  Character.isLetter
							ii) Character.isDigit
							iii)Character.isSpaceChar
							iv) else -> consider as special character
				*/
				
				//Convert String to Char Array 
				char[] arrTest = test.toCharArray();
				
				for(int iterator=0;iterator<=arrTest.length-1;iterator++) {
					char temp = arrTest[iterator];
					if(Character.isLetter(temp)) {
						letter++;
					}
					else if(Character.isSpaceChar(temp)) {
						space++;
					}
					else if(Character.isDigit(temp)) {
						space++;
					}else {
						specialChar++;
					}
					
				}
				
				// Print the count here
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

				

	}

}
