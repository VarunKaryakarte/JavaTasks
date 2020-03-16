package com.task.encap2;

import com.task.encap.Encapsulation;

public class Derived2 extends Encapsulation{
	
	Derived2() {
	
		
		System.out.println("Inside Derived2 constructor");
		
		System.out.println("publicVariable = " +publicVariable);
		
		System.out.println("protectedVariable = " +protectedVariable);

		
		
		// using the getter to access private variable
		
		System.out.println("privateVariablle = " + getPrivateVariable());
		
		System.out.println("default variable = " +getDefaultVariable());
		System.out.println();
				
		
	}

}
