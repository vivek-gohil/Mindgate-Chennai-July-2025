package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.domain.Employee;

public interface EmployeeService {
	boolean deleteEmployeeByEmployeeId(String employeeId);

	Employee updateEmployee(Employee employee);

	Employee addNewEmployee(Employee employee);

	String generateEmployeeId();

	Employee getEmployeeByEmployeeId(String employeeId);

	List<Employee> getAllEmployees();
}
