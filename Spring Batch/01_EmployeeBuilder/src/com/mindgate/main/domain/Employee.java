package com.mindgate.main.domain;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private Address address;

	private Employee() {
		// TODO Auto-generated constructor stub
	}

	public static Employee getEmployee() {
		return new Employee();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ "]";
	}

}
