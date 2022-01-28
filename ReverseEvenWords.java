package weeek1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		

		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/
		
	String test = "I am a software tester"; 
	String[] arrTest = test.split(" ");
	for(int iterator =1;iterator<=arrTest.length;iterator++) {
		if(iterator %2 == 0) {
			char[] arrChar = arrTest[iterator-1].toCharArray();
			for(int iterator2 =arrChar.length-1;iterator2>=0;iterator2--) {
				System.out.println(arrChar[iterator2]);
			}
		}else {
			System.out.println(arrTest[iterator-1]);
		}
	}
	
	}

}
