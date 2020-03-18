package com.generics.Gen2;

public class Gen1 <T , V>{
		T objectOne;
		V objectTwo;
		
		Gen1(T o , V b) {
			objectOne = o;
			objectTwo = b;
		}
		
		public T getObjectOne() {
			return objectOne;
		}
		
		public V getObjectTwo() {
			return objectTwo;
		}
		
		public void showObjectOne() {
			System.out.println("The type of T is = " +objectOne.getClass().getName());
		}
		
		public void showObjectTwo() {
			System.out.println("The type of V is = " +objectTwo.getClass().getName());
		}
	

}
