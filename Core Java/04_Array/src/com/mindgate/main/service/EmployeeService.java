package com.mindgate.main.service;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.repository.EmployeeRepository;

public class EmployeeService {
	private EmployeeRepository employeeRepository = new EmployeeRepository();

	
	public Employee searchEmployeeByEmployeeId(int employeeId) {
		Employee employee = employeeRepository.getEmployeeByEmployeeId(employeeId);
		employee.getName().toUpperCase();
		return employee;
	}
}
