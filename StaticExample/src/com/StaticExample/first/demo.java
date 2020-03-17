package com.StaticExample.first;
import java.util.*;


public class demo {

	public static void main(String args[]) {
		StaticExample.setCollegeName("CMR EC");
		
		StaticExample rahul = new StaticExample("Rahul" , 1);
		StaticExample raj = new StaticExample("Raj" , 2);
		
		rahul.printInfo();
		raj.printInfo();
		
	}
}
