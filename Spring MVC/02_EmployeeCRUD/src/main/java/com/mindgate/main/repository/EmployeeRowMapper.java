package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.Department;
import com.mindgate.main.domain.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		String employeeId = resultSet.getString("employee_id");
		String name = resultSet.getString("name");
		double salary = resultSet.getDouble("salary");
		LocalDate dateOfBirth = resultSet.getDate("date_of_birth").toLocalDate();
		String departmentId = resultSet.getString("department_id");
		String departmentName = resultSet.getString("department_name");

		Department department = new Department(departmentId, departmentName);

		String gender = resultSet.getString("gender");
		String state = resultSet.getString("state");
		String emailId = resultSet.getString("email_id");

		Employee employee = new Employee(employeeId, name, salary, dateOfBirth, department, gender, state, emailId);
		return employee;
	}

}
