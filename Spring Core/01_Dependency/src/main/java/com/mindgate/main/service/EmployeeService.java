package com.mindgate.main.service;

import com.mindgate.main.repository.EmployeeRepository;

public class EmployeeService {
	private EmployeeRepository employeeRepository;

	public EmployeeService() {
		System.out.println("Default Constructor of EmployeeService");
	}

	// Creating to get employeeRepository object from main
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
		System.out.println("Parameterized Constrcutor of EmployeeService");
	}

	// Creating getter and setter to get employeeRepository object from main
	public EmployeeRepository getEmployeeRepository() {
		System.out.println("getEmployeeRepository()");
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setEmployeeRepository()");
		this.employeeRepository = employeeRepository;
	}

	public void doGreet() {
		System.out.println("doGreet() of service start");
		employeeRepository.greet();
		System.out.println("doGreet() of service end");
	}
}
