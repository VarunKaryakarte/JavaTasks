package com.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String args[]) {
	
	HashSet<String> set = new HashSet<String>();
	
	// to add elements to the set
		set.add("one");
		set.add("two");
		set.add("one");
		set.add("three");
		set.add(null);
		
		//to print elements of the set
		
		Iterator<String> itr = set.iterator();  
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
