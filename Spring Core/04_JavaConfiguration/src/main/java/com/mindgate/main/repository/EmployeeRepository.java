package com.mindgate.main.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class EmployeeRepository {

//	public EmployeeRepository() {
//		System.out.println("Default Constrcutor of EmployeeRepository");
//	}

	public void greet() {
		System.out.println("greet() of EmployeeRepository");
	}
}
