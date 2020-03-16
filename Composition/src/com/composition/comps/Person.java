package com.composition.comps;

public class Person {

	private Job job;
	
	public Person() {
		this.job = new Job();
		job.setSalary(100000);
		
	}
	public long getSalary() {
		return job.getSalary();
	}
}
