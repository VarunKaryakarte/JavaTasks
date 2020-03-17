package com.access.modifier;

public class Accessor {
	
		Accessor() {
			Access obj = new Access();
	
			System.out.println("Same package non sub class");
			System.out.println("public variable = " +obj.publicVariable);
	
			//error since var is private
			//System.out.println("private variable = " +obj.privateVariable);
	
			System.out.println("default variable = " +obj.defaultVariable);
	
			System.out.println("protected variable = " +obj.protectedVariable);
			System.out.println();
	
	}
}

