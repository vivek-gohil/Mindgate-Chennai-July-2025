package com.mindgate.main.repository;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {

	public EmployeeRepository() {
		System.out.println("Default Constrcutor of EmployeeRepository");
	}

	public void greet() {
		System.out.println("greet() of EmployeeRepository");
	}
}
