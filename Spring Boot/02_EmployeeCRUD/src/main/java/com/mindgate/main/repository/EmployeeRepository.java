package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.dto.EmployeeDTO;

public interface EmployeeRepository {

	EmployeeDTO getEmployeeByEmployeeId(String employeeId);

	boolean deleteEmployeeByEmployeeId(String employeeId);

	Employee updateEmployee(Employee employee);

	Employee addNewEmployee(Employee employee);

	String generateEmployeeId();

	List<EmployeeDTO> getAllEmployees();
	

}
