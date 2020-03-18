package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// add elements in the list
		list.add(3);
		list.add(4);
		list.add(5);
		
		//error, cannot add string
		//list.add("varun");
		
		//get elements by index
		System.out.println("the element at index 0 is = " +list.get(0));
		
		//iterate through the list using Iterator
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//clear the entire list
		list.clear();
		
		System.out.println("the cleared list = " +list);
		
	}
}
