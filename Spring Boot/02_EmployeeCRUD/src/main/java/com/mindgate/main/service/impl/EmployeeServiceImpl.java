package com.mindgate.main.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.dto.EmployeeDTO;
import com.mindgate.main.mapper.EmployeeMapper;
import com.mindgate.main.repository.EmployeeRepository;
import com.mindgate.main.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public EmployeeDTO getEmployeeByEmployeeId(String employeeId) {
		EmployeeDTO employeeDTO = employeeRepository.getEmployeeByEmployeeId(employeeId);
		log.info(employeeDTO.toString());
		return employeeDTO; 
	}

	public boolean deleteEmployeeByEmployeeId(String employeeId) {
		// TODO Auto-generated method stub
		return employeeRepository.deleteEmployeeByEmployeeId(employeeId);
	}

	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
		Employee employee =	EmployeeMapper.mapEmployeeDTOToEmployee(employeeDTO, new Employee());
		employee= employeeRepository.updateEmployee(employee);
		employeeDTO = EmployeeMapper.mapEmployeeToEmployeeDTO(employee, employeeDTO);
			// TODO Auto-generated method stub
			return  employeeDTO;
	}

	public EmployeeDTO addNewEmployee(EmployeeDTO employeeDTO) {
	Employee employee =	EmployeeMapper.mapEmployeeDTOToEmployee(employeeDTO, new Employee());
	employee= employeeRepository.addNewEmployee(employee);
	employeeDTO = EmployeeMapper.mapEmployeeToEmployeeDTO(employee, employeeDTO);
		// TODO Auto-generated method stub
		return  employeeDTO;
	}

	public String generateEmployeeId() {
		// TODO Auto-generated method stub
		return employeeRepository.generateEmployeeId();
	}

	public List<EmployeeDTO> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getAllEmployees();
	}
	}
