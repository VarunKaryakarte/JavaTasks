package com.inheritance.box;

public class Box {
	
		double width;
		
		double length;
		
		double height;
		
// Box with no dimensions 
	public	Box() {
			this.width = -1;
			this.height = -1;
			this.length = -1;
		}
		
// Box with dimensiosn 
	public Box( double width , double height , double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public double volume() {
		return width * height * length;
	}

}
