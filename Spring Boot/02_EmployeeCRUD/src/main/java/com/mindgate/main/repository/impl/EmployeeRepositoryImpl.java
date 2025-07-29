package com.mindgate.main.repository.impl;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.dto.EmployeeDTO;
import com.mindgate.main.exception.ResourceNotFoundException;
import com.mindgate.main.repository.EmployeeRepository;
import com.mindgate.main.repository.rowmapper.EmployeeRowMapper;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	private JdbcTemplate jdbcTemplate;

	private final String SELECT_ALl_EMPLOYEES = "SELECT * FROM employee_details e JOIN department_details d ON e.department_id = d.department_id";
	private final String SELECT_ONE_EMPLOYEE = "SELECT * FROM employee_details e JOIN department_details d ON e.department_id = d.department_id WHERE employee_id = ?";
	private final String GENERATE_NEXT_EMPLOYEE_ID = "SELECT employee_id_seq.NEXTVAL FROM dual";
	private final String INSERT_NEW_EMPLOYEE = "INSERT INTO employee_details VALUES(?,?,?,?,?,?,?,?)";
	private final String UPDATE_EMPLOYEE = "UPDATE employee_details SET name =?,salary=?, date_of_birth = ? , department_id =?, gender =?, state=?, email_id= ? Where employee_id=? ";
	private final String DELETE_EMPLOYEE = " DELETE FROM employee_details WHERE employee_id=? ";

	public EmployeeRepositoryImpl(JdbcTemplate jdbcTemplate) {
		System.out.println("para cons of emprepo");
		this.jdbcTemplate = jdbcTemplate;
	}

	public EmployeeDTO getEmployeeByEmployeeId(String employeeId) {
		try {
			return jdbcTemplate.queryForObject(SELECT_ONE_EMPLOYEE, new EmployeeRowMapper(), employeeId);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Employee", "employeeId", employeeId);
		}
	}

	public boolean deleteEmployeeByEmployeeId(String employeeId) {
		int rowCount = jdbcTemplate.update(DELETE_EMPLOYEE, employeeId);
		if (rowCount > 0)
			return true;
		return false;
	}

	public Employee updateEmployee(Employee employee) {
		jdbcTemplate.update(UPDATE_EMPLOYEE, employee.getName(), employee.getSalary(), employee.getDateOfBirth(),
				employee.getDepartmentId(), employee.getGender(), employee.getState(), employee.getEmailId(),
				employee.getEmployeeId());

		return employee;

	}

	public Employee addNewEmployee(Employee employee) {
		String employeedId = generateEmployeeId();
		jdbcTemplate.update(INSERT_NEW_EMPLOYEE, employeedId, employee.getName(), employee.getSalary(),
				employee.getDateOfBirth(), employee.getDepartmentId(), employee.getGender(), employee.getState(),
				employee.getEmailId());
		employee.setEmployeeId(employeedId);
		return employee;
	}

	public String generateEmployeeId() {
		return "MGS " + jdbcTemplate.queryForObject(GENERATE_NEXT_EMPLOYEE_ID, Integer.class);
	}

	public List<EmployeeDTO> getAllEmployees() {
		// jdbcTemplate.query(SELECT_ALl_EMPLOYEES, new EmployeeRowMapper());
		return jdbcTemplate.query(SELECT_ALl_EMPLOYEES, new EmployeeRowMapper());
	}

}
