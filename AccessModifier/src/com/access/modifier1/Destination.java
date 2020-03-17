package com.access.modifier1;

import com.access.modifier.Access;

public class Destination extends Access {
	
	//Sub class of ACCESS
	
	
	Destination() {
		System.out.println("diff package sub class");
		System.out.println("public variable = " +publicVariable);
	
		//error since var is private
		//System.out.println("private variable = " +privateVariable);
	
		System.out.println("proctedd variable = " +protectedVariable);
		System.out.println();
		// error since var is default
		//System.out.println("default variable = " +defaultVariable);
		
	}
	

}
