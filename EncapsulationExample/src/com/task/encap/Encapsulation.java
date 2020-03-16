package com.task.encap;

public class Encapsulation {
	
	

	private int privateVariable = 1; // can be accessed in the same class only
	
	public int publicVariable = 2; // can be accessed Anywhere
	
	
	

	int defaultVariable = 3; //  Same class and Package only
	
	protected int protectedVariable = 4; // SAME CLASS AND SUBCLASSES IN DIFFERENT PACKAGE
	
	public Encapsulation() {
		System.out.println("Constructor in class Encapsulation");
		System.out.println("privateVariable = " +privateVariable);
		System.out.println("publicVariable = " +publicVariable);
		System.out.println("protectedVariable = " +protectedVariable);
		System.out.println("default variable = " +defaultVariable); 
		System.out.println();
	}
	
	
	// G&S FOR PRIVATE VAR
	public int getPrivateVariable() {
		return privateVariable;
	}

	public void setPrivateVariable(int privateVariable) {
		this.privateVariable = privateVariable;
	}
	
	
	// G&S FOR DEFAULT VAR

	public int getDefaultVariable() {
		return defaultVariable;
	}

	public void setDefaultVariable(int defaultVariable) {
		this.defaultVariable = defaultVariable;
	}

	//G&S FOR PROTECTED VAR
	public int getProtectedVariable() {
		return protectedVariable;
	}

	public void setProtectedVariable(int protectedVariable) {
		this.protectedVariable = protectedVariable;
	}
	
}
