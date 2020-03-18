package com.generics.Gen;

public class GenDemo {
	
	public static void main(String args[]) {
		// Creating Gen Reference for Integer
		Gen<Integer> iOb; 
		
		//Error, as the parameter cannot be a primitive datatype
		//Gen<int> iob;
		
		iOb = new Gen<Integer>(99);
		
		// to show the type of iOb
		iOb.showType();
		
		int v = iOb.getOb();
		System.out.println("the value of iOb =  " +v);
		
	}

}
