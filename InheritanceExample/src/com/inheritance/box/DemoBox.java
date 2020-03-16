package com.inheritance.box;

public class DemoBox {
	public static void main(String args[]) {
		BoxWeight newBox = new BoxWeight(20 , 23 , 33 ,33);
		
		// vol of the box
		System.out.println(" vol of the box = " +newBox.volume());
		
		// Weighth of the box
		
		System.out.println("Weight of the box = " +newBox.weight);
	}

}
