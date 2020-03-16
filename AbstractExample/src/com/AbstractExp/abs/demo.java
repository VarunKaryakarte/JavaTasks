package com.AbstractExp.abs;

public class demo {
	public static void main(String args[]) {
	
	Square square = new Square(10 , 10);
	double areaSquare = square.area();
	
	System.out.println("Area of square  = " +areaSquare);
	System.out.println();
	
	Triangle triangle = new Triangle(30 , 20);
	double areaTri = triangle.area();
	
	System.out.println("Area of Triangle = " +areaTri);
	}
}
