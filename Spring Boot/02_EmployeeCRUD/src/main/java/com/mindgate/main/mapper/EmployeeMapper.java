package com.mindgate.main.mapper;

import com.mindgate.main.domain.Department;
import com.mindgate.main.domain.Employee;
import com.mindgate.main.dto.DepartmentDTO;
import com.mindgate.main.dto.EmployeeDTO;

public class EmployeeMapper {
	private EmployeeMapper () {
		
	}
     
	public static EmployeeDTO mapEmployeeToEmployeeDTO(Employee employee, EmployeeDTO employeeDTO) {
		employeeDTO.setEmployeeId(employee.getEmployeeId());
		employeeDTO.setName(employee.getName());
		employeeDTO.setSalary(employee.getSalary());
		employeeDTO.setDateOfBirth(employee.getDateOfBirth());
		DepartmentDTO departmentDTO = new DepartmentDTO(employee.getDepartmentId(), null);
		employeeDTO.setDepartmentDTO(departmentDTO);
		
		employeeDTO.setGender(employee.getGender());
		employeeDTO.setState(employee.getState());
		employeeDTO.setEmailId(employee.getEmailId());
		return employeeDTO;
	}
	public static Employee mapEmployeeDTOToEmployee(EmployeeDTO employeeDTO, Employee employee) {
		employee.setEmployeeId(employeeDTO.getEmployeeId());
		employee.setName(employeeDTO.getName());
		employee.setSalary(employeeDTO.getSalary());
		employee.setDateOfBirth(employeeDTO.getDateOfBirth());
		employee.setDepartmentId(employeeDTO.getDepartmentDTO().getDepartmentId());
		employee.setGender(employeeDTO.getGender());
		employee.setState(employeeDTO.getState());
		employee.setEmailId(employeeDTO.getEmailId());
		return employee;
	}
}
