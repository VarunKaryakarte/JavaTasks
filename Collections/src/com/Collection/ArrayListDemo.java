package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String args[]) {
	// this list can only store string objects
	ArrayList<String> list = new ArrayList<String>();
	
	//this list can store any type of data
	ArrayList list2 = new ArrayList();
	
	//adding data in list of type String
	list.add("one");
	list.add("two");
	list.add("three");

	
	//error
	//list.add(3); cannot add an integer here since we've made a list of type string
	
	//Adding data in list2 of any data type
	
	list2.add(2); //add an integer to the list
	list2.add("string"); // adds string to the list
	list2.add(2.2); //adds float value to the list
	
	
	// how to iterate through a list
	System.out.println("Iterating using for loop");
	for(String str :list) {
		System.out.println(str);
	}
	
	
	// Iterate using an iterator 
	System.out.println("Iterate using Iterator");
	Iterator<String> itr  = list.iterator();
	
	while(itr.hasNext())
		System.out.println(itr.next());
	
}
	
}
