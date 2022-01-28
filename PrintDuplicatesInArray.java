package weeek1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20} ;
		// get the length of the array

		int arrLength = arr.length;

		// declare an int variable named count
		int count ;

		// iterate from 0 to the array length-1 (outer loop starts here)
		for(int iterator=0;iterator <= arrLength-1;iterator++) {
			// assign 0 to count 
			count = 0;

			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for(int iterator2=iterator+1;iterator2 <=arrLength-1;iterator2++) {

				// compare both the loop variables & check they're equal
				if(arr[iterator] == arr[iterator2]) {
					// increase the count if both the arrays are equal
					count++;
				}				
			}
			// Out of the inner loop, check and print the first array variable if count is more than 0
			if(count > 0) {
				System.out.println("The variable " + arr[iterator] + "is duplicated");
			}

		}

	}

}

