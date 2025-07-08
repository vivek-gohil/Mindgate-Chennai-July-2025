package com.mindgate.main.domain;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private static int employeeIdGenerator = 10001;

	static {
		System.out.println("Static block");
	}

	{
		System.out.println("Non-static block");
	}

	public Employee() {
		System.out.println("Employee Default Constructor");
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		employeeId = employeeIdGenerator++;
		System.out.println("Employee Overloaded Constructor");
	}

	public static void display() {
		System.out.println("Employee static method called");
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

}
