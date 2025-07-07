package com.mindgate.main.domain;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("Default constructor of Employee");
	}

	public Employee(int employeeId, String name, double salary) {
		System.out.println("Overloaded constructor of Employee - 3 Params");
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name, double salary) {
		System.out.println("Overloaded constructor of Employee - 2 Params");
		this.name = name;
		this.salary = salary;
	}

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
