package com.task.encap;

public class SamePackage {
	
	// THIS IS A NON SUB CLASS IN THE SAME PACKAGE 
	
	SamePackage() {
		Encapsulation obj = new Encapsulation();
		
		System.out.println("Inside the SamePackage Constructor");
		System.out.println("public var = " +obj.publicVariable );
		
		// We can access a private variable outside a class using a getter 
		
		System.out.println("private var = " + obj.getPrivateVariable()); 
		
		System.out.println("Protected var = " +obj.protectedVariable);
		
		System.out.println("default var = " +obj.defaultVariable);
	}
}
