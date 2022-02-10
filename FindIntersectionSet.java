package week3.org.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersectionSet {

	public static void main(String[] args) {

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
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(3,2,11,4,6,7));
		Set<Integer> set2 = new TreeSet<Integer>(Arrays.asList(1,2,8,4,9,7));
		for (Integer integer : set) {
			set2.add(integer);
		}
		for (Integer integer : set2) {
			System.out.println(integer);
		}
	}

}
