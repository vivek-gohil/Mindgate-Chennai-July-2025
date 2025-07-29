package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.dto.EmployeeDTO;

public interface EmployeeService {
	EmployeeDTO getEmployeeByEmployeeId(String employeeId);

	boolean deleteEmployeeByEmployeeId(String employeeId);

	EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);

	EmployeeDTO addNewEmployee(EmployeeDTO employeeDTO);

	String generateEmployeeId();

	List<EmployeeDTO> getAllEmployees();

}
