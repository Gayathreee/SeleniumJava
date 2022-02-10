package week3.org.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
		 */
		
		// Here is the input
			
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3,2,1,4,6,12));
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));

	}

}
