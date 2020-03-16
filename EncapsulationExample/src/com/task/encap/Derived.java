package com.task.encap;

public class Derived extends  Encapsulation{
	
	//This is a sub class in the same package
	
	Derived() {
		System.out.println("Constructor of Derived Class");
		System.out.println("protectedVarible in derived class = " +protectedVariable);
		
		
		 System.out.println("privateVariable = " +getPrivateVariable());
		
		System.out.println("public variable in Derived class = " +publicVariable);
		
		System.out.println("default variable in Derived class = " +defaultVariable);
		System.out.println();
		
	}

}
