package com.InterfaceSeg;

public  class Dog implements Pet{
	
	

	private String name;
	private String type;
	
	public Dog(String name ,String type) {
		this.name = name;
		this.type= type;
	}

	@Override
	public String name() {
		return name;
	}
	
	@Override
	public String type() {
		
		return type;
	}
	
	@Override
	public void groom() {
		System.out.println("This animal can be groomed since it is a pet");
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

}
