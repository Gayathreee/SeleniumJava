
package weeek1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		 
		String  name = "tattarrattat";
		String rev = "";
		
		char[] nameArr = name.toCharArray();
		
		for(int iterator =nameArr.length-1;iterator>=0;iterator--) {			
			//rev = nameArr[iterator];
			rev = rev + nameArr[iterator];
			System.out.println(rev);
			
		}
		if(name.equals(rev)){
			System.out.println("String " + name + " is a Palindrome");
		}else {
			System.out.println("String " + name + " is not a Palindrome");
		}
		
	}

}
