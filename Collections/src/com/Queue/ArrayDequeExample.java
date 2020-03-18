package com.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	
	public static void main(String[] args) {  
		//Creating Deque and adding elements  
		
		Deque<String> deque = new ArrayDeque<String>();  
		
		deque.add("one");  
		deque.add("two");  
		deque.add("three");  
		
		//Traversing elements  
		for (String str : deque) {  
			System.out.println(str);  
		}  
		
		
	}  

}
