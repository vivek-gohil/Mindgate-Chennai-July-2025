package com.mindgate.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(String employeeId) {
		return employeeRepository.deleteEmployeeByEmployeeId(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.updateEmployee(employee);
	}

	@Override
	public Employee addNewEmployee(Employee employee) {
		return employeeRepository.addNewEmployee(employee);
	}

	@Override
	public String generateEmployeeId() {
		return employeeRepository.generateEmployeeId();
	}

	@Override
	public Employee getEmployeeByEmployeeId(String employeeId) {
		return employeeRepository.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}

}
