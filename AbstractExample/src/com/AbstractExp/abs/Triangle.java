
package com.AbstractExp.abs;

public class Triangle extends Figure {
	
	Triangle(double a ,double b) {
		super(a ,b);
	}

	@Override
	double area() {
		System.out.println("Area of a Triangle");
		return dimensionOne * dimensionTwo / 2;
	}
	
	

}
