package week3.org.assignments;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestInSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
		 */
		
		// Here is the input		
		int count=0;
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(3,2,61,4,6,12));
		for (Integer integer : set) {
			if(count == set.size()-2) {
				System.out.println(integer);
			}
			count++;	
		}
	}

}
