package week3.org.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicatesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into List and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the List
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
		String text = "We learn java basics as part of java sessions in java week1";	
		int count = 0;
		int i=0;
		List<String> list =  Arrays.asList(text.split(" "));
		List<String> updated = new ArrayList<String>(list);
		
		for (String string : list) {
			
			for (String string2 : list) {
				
				if(string.equals(string2)) {
					count++;
				}
			}
			if(count>1) {
				updated.set(i, "")		;
				}
			count =0;
			i++;
		}
		for (String string : updated) {
			System.out.println(string);
		}
		
	}

}
