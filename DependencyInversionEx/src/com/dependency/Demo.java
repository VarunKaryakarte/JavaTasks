package com.dependency;

public class Demo {
	

	public static void main(String args[]) {
	Member1 member1 = new Member1("Ron" , "Teaching");
	
	NoPower nopower = new NoPower("janitor");
	
	member1.memberRole();
	member1.powerToUnlock();
	
	nopower.memberRole();
	


	}
	}
