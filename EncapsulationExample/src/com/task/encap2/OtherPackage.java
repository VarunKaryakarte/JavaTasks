package com.task.encap2;
import com.task.encap.*;

public class OtherPackage {

	OtherPackage() {
		Encapsulation obj = new Encapsulation();
		
		System.out.println("We are inside the constructor of OtherPackage");
		
		System.out.println("publicVariable = " +obj.publicVariable);
		System.out.println();
		
		
		System.out.println("privateVariablle = " +obj.getPrivateVariable());
		
		
		System.out.println("protectedVariablle = " +obj.getProtectedVariable());
		
		
		System.out.println("defaultVariablle = " +obj.getDefaultVariable());
		
		System.out.println();
				
	}
}
