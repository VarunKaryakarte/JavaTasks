package com.InterfaceSeg;

public class Lion implements Wild {
	
	private String name;
	
	private String type;
	
	Lion(String name , String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void notGroomed() {
		// TODO Auto-generated method stub
		
		System.out.println("this cannot be groomed since it is wild");
		
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
