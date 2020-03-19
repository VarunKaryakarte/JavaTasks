package com.Liscov.Ex;

public class CBSE implements Board{
	
	private String name;
	
	private long classes;
	
	CBSE(String name,  long classes){
		this.name = name;
		this.classes = classes;
	}

	

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public long classes() {
		
		return this.classes;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getClasses() {
		return classes;
	}

	public void setClasses(long classes) {
		this.classes = classes;
	}
	

}
