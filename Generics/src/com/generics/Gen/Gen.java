package com.generics.Gen;

public class Gen<T> {
		T ob; // Declare an object of type T
		
		Gen(T o) {
			ob = o;
		}
		
		// To return ob
		T getOb() {
			return ob;
		}
		
		//show type of T passed as a parameter
		void showType() {
			System.out.println("Type of T is = " +ob.getClass().getName());
		}
		

}
