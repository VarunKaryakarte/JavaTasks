package com.generics.Gen2;

public class Gen1Demo {

	public static void main(String args[]) {
		Gen1<Integer , String> obj =  new Gen1<Integer , String>(23 ,  "hi");
		
		int obj1 = obj.getObjectOne();
		String obj2 = obj.getObjectTwo();
		
		obj.showObjectOne();
		System.out.println(" value =  " +obj1);
		
		System.out.println();
		
		obj.showObjectTwo();
		System.out.println("value = " +obj2);
		
		
		
	
		
		
		
	}
	
	
	
}
