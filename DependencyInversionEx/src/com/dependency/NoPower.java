package com.dependency;

public class NoPower  implements MemberRole{
	
	String name;
	NoPower(String name) {
		this.name = name;
	}
	@Override
	public void memberRole() {
		System.out.println("this member has no power");
		
	}

}
