package com.OpenClose;

public class Addition implements Calculator{
	
	private double firstVar;
	
	private double secondVar;
	double result = 0.0;
	
	public Addition(double a , double b) {
		this.firstVar = a;
		this.secondVar = b;
	}
	
	

	@Override
	public double performOperation() {
		result = firstVar + secondVar;
		return result;
	}

	public double getFirstVar() {
		return firstVar;
	}

	public void setFirstVar(double firstVar) {
		this.firstVar = firstVar;
	}

	public double getSecondVar() {
		return secondVar;
	}

	public void setSecondVar(double secondVar) {
		this.secondVar = secondVar;
	}
	

}
