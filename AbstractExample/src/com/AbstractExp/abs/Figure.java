package com.AbstractExp.abs;

public abstract class Figure {
	
	double dimensionOne;
	
	double dimensionTwo;
	
	Figure(double dimensionOne , double dimensionTwo) {
		this.dimensionOne = dimensionOne;
		this.dimensionTwo = dimensionTwo;
	}
	
		abstract double area();

}
