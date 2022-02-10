package week3.org.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		Set<Integer> set2 = new TreeSet<Integer>();

		for (Integer integer : set) {
			System.out.println(Collections.frequency(set, integer));
			if (Collections.frequency(set, integer)>1) {
				set2.add(integer);
			}
		}
		if (set2.size()==0) {
			System.out.println("There are no duplicates");
		}
	}

}
