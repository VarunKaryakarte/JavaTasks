package com.StaticExample.first;

public class StaticExample {
	
	 static String collegeName;
	 
	 	String studentName;
	 
	 	long studentId;
	 	
	 	StaticExample(String name , long id) {
	 		this.studentName = name;
	 		this.studentId = id;
	 	}
	 	
	 static	void setCollegeName(String name) {
	 		collegeName = name;
	 	}
	 	
	 void printInfo() {
		 System.out.println("Student Name = "  +this.studentName);
		 System.out.println("Student Id = "  +this.studentId);
		 
		 System.out.println("College Name = "  +collegeName);
		 System.out.println();
		 
	 }
}
