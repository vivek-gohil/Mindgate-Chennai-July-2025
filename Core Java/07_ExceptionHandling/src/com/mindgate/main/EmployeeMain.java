package com.mindgate.main;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.exceptions.InvalidEmployeeSalaryException;

public class EmployeeMain {
	public static void main(String[] args) {
		try {
			Employee employee = new Employee(101, "Test", 2000);
			System.out.println(employee);
		} catch (InvalidEmployeeSalaryException e) {
			System.out.println(e.getMessage());
		}
	}
}
