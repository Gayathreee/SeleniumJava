package week3.org.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,7,8));

		int iterator =1;

		// Sort the List	
		Collections.sort(list);

		// loop through the list 

		for (Integer integer : list) {
			if(integer!=iterator) {
				System.out.println("The missing element is "+iterator);
				break;
			}
			iterator++;
		}


	}

}
