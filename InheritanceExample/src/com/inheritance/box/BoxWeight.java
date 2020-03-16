package com.inheritance.box;

public class BoxWeight extends Box{

	double weight;
	
	// Box with no dimensions
	BoxWeight() {
		this.height = -1;
		this.length = -1;
		this.weight = 1;
		this.width = -1;
	}
	
	BoxWeight(double height , double length , double weight , double width ) {
		this.height = height;
		this.length = length;
		this.weight = weight;
		this.width = width;
	}
	
}
