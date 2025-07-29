package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Employee;

public interface EmployeeRepository {

	boolean deleteEmployeeByEmployeeId(String employeeId);

	Employee updateEmployee(Employee employee);

	Employee addNewEmployee(Employee employee);

	String generateEmployeeId();

	Employee getEmployeeByEmployeeId(String employeeId);

	List<Employee> getAllEmployees();
}
