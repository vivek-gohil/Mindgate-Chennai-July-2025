package com.mindgate.main.domain;

import java.time.LocalDate;

public class Employee {
	private String employeeId;
	private String name;
	private double salary;
	private LocalDate dateOfBirth;
	private Department department;
	private String gender;
	private String state;
	private String emailId;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeId, String name, double salary, LocalDate dateOfBirth, Department department,
			String gender, String state, String emailId) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.gender = gender;
		this.state = state;
		this.emailId = emailId;
	}

	public Employee(String name, double salary, LocalDate dateOfBirth, Department department, String gender,
			String state, String emailId) {
		super();

		this.name = name;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.gender = gender;
		this.state = state;
		this.emailId = emailId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", dateOfBirth="
				+ dateOfBirth + ", department=" + department + ", gender=" + gender + ", state=" + state + ", emailId="
				+ emailId + "]";
	}

}
