package com.AbstractExp.abs;

public class Square extends Figure{
	
	Square(double a , double b) {
		super(a , b);
	}

	@Override
	double area() {
		System.out.println("Area of Square");
		return dimensionOne * dimensionTwo;
	}
}
