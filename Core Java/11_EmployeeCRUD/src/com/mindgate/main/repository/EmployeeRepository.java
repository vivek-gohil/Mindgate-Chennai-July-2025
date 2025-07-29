package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Employee;

public interface EmployeeRepository {
	// select all employees
	List<Employee> getAllEmployees();

	// select one employee
	Employee getEmployeeByEmployeeId(String employeeId);

	// insert new employee
	Employee addNewEmployee(Employee employee);

	// update employee
	Employee updateEmployee(Employee employee);

	// delete employee
	boolean removeEmployeeByEmployeeId(String employeeId);

	// generate next employeeId
	String generateNextEmployeeId();
}
