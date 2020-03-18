package com.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String args[]) {
		TreeSet<String> set = new TreeSet<String>();
		
		//adding elements in a tree set
		set.add("one");
		set.add("two");
		set.add("three");
		
		//error cannot contain null values
		//set.add(null);
		
		// print elements of the set
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
