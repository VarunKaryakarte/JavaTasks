package com.Liscov.Ex;

import java.util.ArrayList;
import java.util.List;

public class Demo  {
	
	public static void main(String args[]) {
		List<Board> list = new ArrayList<Board>();
		
		ISC school = new ISC("HPS" , 12);
		list.add(school);
		CBSE school1 = new CBSE("DPS" , 12);
		list.add(school1);
	

	for(Board b : list) {
		System.out.println(b.name());
	 }
	}
}
