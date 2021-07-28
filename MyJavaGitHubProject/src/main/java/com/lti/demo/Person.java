package com.lti.demo;

public class Person {
	private int perId;
	private String perName;
	private double perSalary;
	
	public Person() {
		super();
	}

	public Person(int perId, String perName, double perSalary) {
		super();
		this.perId = perId;
		this.perName = perName;
		this.perSalary = perSalary;
	}

	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public double getPerSalary() {
		return perSalary;
	}

	public void setPerSalary(double perSalary) {
		this.perSalary = perSalary;
	}

	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + ", perSalary=" + perSalary + "]";
	}
	
	

}
