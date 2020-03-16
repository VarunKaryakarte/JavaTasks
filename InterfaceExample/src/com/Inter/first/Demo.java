package com.Inter.first;

public class Demo {
	
	public static void main(String args[]) {
		
	// Create a new Iphone 	
	Iphone iphone = new Iphone();
	iphone.processor(" system-on-chip");
	iphone.camera(25);
	iphone.unlock("Face Recognition");
	iphone.size(5);
	
	iphone.printStates();
	
	// creat a new OnePlus device
	
	OnePlus oneplus = new OnePlus();
	oneplus.processor("Snap dragon");
	oneplus.camera(48);
	oneplus.size(5.5);
	oneplus.unlock("fingerprint");
	
	oneplus.printStates();
	}
	
	
	
	
}
