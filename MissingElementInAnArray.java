package weeek1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {


	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		Arrays.sort(arr);

		// loop through the array (start i from arr[0] till the length of the array)
		for(int iterator=1;iterator<=arr.length;iterator++){

			// check if the iterator variable is not equal to the array values respectively
			if(iterator != arr[iterator-1]) {

				// print the number
				System.out.println("The missing number in the given array is "+iterator);
				// once printed break the iteration
				break;

			}
		}	


	}
}
