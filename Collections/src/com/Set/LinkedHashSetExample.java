package com.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String args[]) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		// add elements
		set.add(null);
		set.add(1);
		set.add(3);
		set.add(5);
		
		// check if the set contains the given objects
		System.out.println("does the set contain 5 = "+set.contains(5));

		// print elements using for loop
		
		for(Integer  in : set) {
			System.out.println(in);
		}
		
		//clear the set
		set.clear();
		
		System.out.println("the empty set = " +set);
	}

}
