package com.OpenClose;

public class Addition2 extends Addition{

	public Addition2(double a, double b) {
		super(a, b);
		
	}
	double res = 0.0;
	
	public double multiplyByTwo() {
		res = 2.0 * super.performOperation();
		return res;
	}
	

	

}
