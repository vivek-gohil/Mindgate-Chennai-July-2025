package com.mindgate.main.domain;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;

	public double calculateSalary(double hra, double bonus) {
		return (salary + hra) * 12 + bonus;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
