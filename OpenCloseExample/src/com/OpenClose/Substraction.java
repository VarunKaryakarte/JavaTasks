package com.OpenClose;

public class Substraction implements Calculator{

	private double first;
	
	private double second;
	
	public Substraction(double a, double b) {
		this.first = a;
		this.second = b;
	}

	double result = 0.0;
	@Override
	public double performOperation() {
		result = first - second;
		return result;
		
	}
	public double getFirst() {
		return first;
	}
	public void setFirst(double first) {
		this.first = first;
	}
	public double getSecond() {
		return second;
	}
	public void setSecond(double second) {
		this.second = second;
	}
	
}
