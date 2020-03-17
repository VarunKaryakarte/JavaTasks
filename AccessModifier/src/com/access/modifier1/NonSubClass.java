package com.access.modifier1;

import com.access.modifier.Access;

public class NonSubClass {
	
	//Non sub class of Access
	
		Access obj = new Access();
		NonSubClass(){
			System.out.println("diff package non subclass");
			System.out.println("public variable = " +obj.publicVariable);
			System.out.println();
			//error since var is private
			//System.out.println("private variable = " +obj.privateVariable);

			//error since var is default
		//	System.out.println("default variable = " +obj.defaultVariable);
			
			
			//error since this is not a sub class of access
			//System.out.println("protected variable = " +obj.protectedVariable);
			
		}
	

}
