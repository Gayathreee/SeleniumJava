package week3.org.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.list.TreeList;

public class RemoveDuplicateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into Set and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the Set
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
		String text = "We learn java basics as part of java sessions in java week1";	
		int count =0;
		
		Set<String> hashSet = new HashSet<String>(Arrays.asList(text.split(" ")));
		Set<String> newTreeSet = new TreeSet<String>(hashSet);
		
		for (String string : newTreeSet) {
			System.out.println(string);
		}
	}

}
