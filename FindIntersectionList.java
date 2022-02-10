package week3.org.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pseudo Code

		 * a) Declare List for {3,2,11,4,6,7};	 
		 * b) Declare another List for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to list length
		 * d) Declare a nested for another list from 0 to list length
		 * e) Compare Both the lists using a condition statement

		 *  f) Print the first list (shoud match item in both lists)
		 *  
		 */
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		List<Integer> secondList = new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		for (Integer integer : list) {
			if(!secondList.contains(integer)) {
				secondList.add(integer);
			}

		}
		Collections.sort(secondList);
		for (Integer integer : secondList) {
			System.out.println(integer);
		}

	}

}
