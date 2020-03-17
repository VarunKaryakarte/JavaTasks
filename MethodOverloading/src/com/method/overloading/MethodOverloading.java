package com.method.overloading;

public class MethodOverloading {
	
	public void displayOverloading() {
		System.out.println("When no parameters are given");
	}
	
	public void displayOverloading(int a) {
		System.out.println("One interger parameter is given = " +a);
	}
	
//	public int displayOverloading(int a) {
//		// this would genrate an error since the return type is different and parameter is 
//		// same as the above
//	}
	
	public void displayOverloading(int a , char b) {
		System.out.println("One interger and one char parameter is given =  " +a + " " +b);
	}
	
}
