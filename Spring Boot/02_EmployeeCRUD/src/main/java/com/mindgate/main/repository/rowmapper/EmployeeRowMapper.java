package com.mindgate.main.repository.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.dto.DepartmentDTO;
import com.mindgate.main.dto.EmployeeDTO;

public class EmployeeRowMapper implements RowMapper<EmployeeDTO> {

	public EmployeeDTO mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		String employeeId = resultSet.getString("employee_id");
		String name = resultSet.getString("name");
		double salary = resultSet.getDouble("salary");
		LocalDate dateOfBirth = resultSet.getDate("date_of_birth").toLocalDate();
		String departmentId = resultSet.getString("department_Id");
		String departmentName = resultSet.getString("department_name");
		DepartmentDTO departmentDTO = new DepartmentDTO(departmentId, departmentName);

//		Department department = new Department();
//		department.setDepartmentId(departmentId);

		String gender = resultSet.getString("gender");
		String state = resultSet.getString("state");
		String emailId = resultSet.getString("email_id");

		EmployeeDTO employeeDTO = new EmployeeDTO(employeeId, name, salary, dateOfBirth, departmentDTO, gender, state,
				emailId);
		return employeeDTO;
	}

}
