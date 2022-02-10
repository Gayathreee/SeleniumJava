package week3.org.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindMissingElementSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(1,2,3,4,6,7,8));

		int iterator =1;

		// loop through the list 

		for (Integer integer : set) {
			if(integer!=iterator) {
				System.out.println("The missing element is "+iterator);
				break;
			}
			iterator++;
		}

	}

}
