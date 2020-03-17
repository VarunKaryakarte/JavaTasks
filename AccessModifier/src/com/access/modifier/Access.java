package com.access.modifier;

public class Access {
	
	public int publicVariable = 1; 
	
	 int defaultVariable = 2;
	 
	 protected int protectedVariable = 3;
	 
	 private int privateVariable = 4;
	

	public Access() {
		 System.out.println("Constructor in class Access");
		 System.out.println("privateVariable = " +privateVariable);
		 System.out.println("publicVariable = " +publicVariable);
		 System.out.println("protectedVariable = " +protectedVariable);
		 System.out.println("default variable = " +defaultVariable); 
		 System.out.println();
	 }

}

