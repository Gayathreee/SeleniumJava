package week3.org.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicateInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		List<Integer> list2 = new ArrayList<Integer>();

		for (Integer integer : list) {
			if (Collections.frequency(list, integer)>1) {
				if(!list2.contains(integer)) {
					list2.add(integer);
				}
			}
		}
		System.out.println(list2.toString());

	}

}
