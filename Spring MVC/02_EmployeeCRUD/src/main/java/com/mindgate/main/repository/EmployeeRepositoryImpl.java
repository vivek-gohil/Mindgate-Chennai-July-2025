package com.mindgate.main.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	private final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employee_details e JOIN department_details d ON e.department_id = d.department_id";
	private final String SELECT_ONE_EMPLOYEE = "SELECT * FROM employee_details WHERE employee_id=?";
	private final String GENERATE_NEXT_EMPLOYEE_ID = "SELECT employee_id_seq.NEXTVAL FROM dual";
	private final String INSERT_NEW_EMPLOYEE = "INSERT INTO employee_details VALUES(?,?,?,?,?,?,?,?)";
	private final String UPDATE_EMPLOYEE = "UPDATE employee_details SET name=?,salary=?,date_of_birth=?,department_id=?,gender=?,state=?,email_id=? WHERE employee_id=?";
	private final String DELETE_EMPLOYEE = "DELETE FROM employee_details WHERE employee_id=?";

	private JdbcTemplate jdbcTemplate;

	public EmployeeRepositoryImpl(JdbcTemplate jdbcTemplate) {
		System.out.println("Parameterized Constructor of EmployeeRepository");
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(String employeeId) {
		int rowCount = jdbcTemplate.update(DELETE_EMPLOYEE, employeeId);
		if (rowCount > 0)
			return true;
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		jdbcTemplate.update(UPDATE_EMPLOYEE, employee.getName(), employee.getSalary(), employee.getDateOfBirth(),
				employee.getDepartment().getDepartmentId(), employee.getGender(), employee.getState(),
				employee.getEmailId(), employee.getEmployeeId());

		return employee;
	}

	@Override
	public Employee addNewEmployee(Employee employee) {
		String employeeId = generateEmployeeId();

		jdbcTemplate.update(INSERT_NEW_EMPLOYEE, employeeId, employee.getName(), employee.getSalary(),
				employee.getDateOfBirth(), employee.getDepartment().getDepartmentId(), employee.getGender(),
				employee.getState(), employee.getEmailId());

		employee.setEmployeeId(employeeId);
		return employee;
	}

	@Override
	public String generateEmployeeId() {
		return "MGS" + jdbcTemplate.queryForObject(GENERATE_NEXT_EMPLOYEE_ID, Integer.class);
	}

	@Override
	public Employee getEmployeeByEmployeeId(String employeeId) {

		return jdbcTemplate.queryForObject(SELECT_ONE_EMPLOYEE, new EmployeeRowMapper(), employeeId);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query(SELECT_ALL_EMPLOYEES, new EmployeeRowMapper());
	}

}
