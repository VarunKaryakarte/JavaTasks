package com.method.over;

public class DEMO {
	public static void main(String args[]) {
	ICICI icici = new ICICI();
	SBI sbi = new SBI();
	
	System.out.println("ROI FOR ICICI IS = " +icici.rateOfInterest());
	System.out.println("ROI FOR SBI IS = " +sbi.rateOfInterest());
}
}
