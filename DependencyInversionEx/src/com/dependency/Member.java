package com.dependency;

 abstract class Member implements MemberRole , PowerToUnlock{

	private String name;
	
	private String role;
	
	Member(String a , String b) {
		this.name = a;
		this.role  = b;
	}
	
	
	
	
	public abstract void powerToUnlock();

	public abstract void MemberRole();
	
	
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
}
