package com.Inter.first;

public class Iphone implements Mobile {
	String unlockType;
	String processor;
	double camera;
	double screenSize;

	
	@Override
	public void unlock(String method) {
		this.unlockType = method;
		
	}

	@Override
	public void processor(String type) {
		this.processor = type;
	}

	@Override
	public void camera(double mp) {
		this.camera = mp;
		
		
	}
	@Override
	public void size(double size) {
		this.screenSize = size;
		
	}
	
	public void printStates() {
		System.out.println("Below are the specs of the Iphone");
		System.out.println("processor = " +processor);
		System.out.println("screen size = " +screenSize);
		System.out.println("camera = " +camera);
		System.out.println("unlock type = " +unlockType);
		System.out.println();
		
	}

}
