package com.mindgate.main.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mindgate.main.domain.Department;
import com.mindgate.main.domain.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private String user = "mindgate_chennai";
	private String password = "mindgate_chennai";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String driver = "oracle.jdbc.driver.OracleDriver";

	private final String SELECT_ALL_EMPLOYEES = "SELECT * FROM employee_details";
	private final String SELECT_ONE_EMPLOYEES = "SELECT * FROM employee_details WHERE employee_id=?";
	private final String GENERATE_NEXT_EMPLOYEE_ID = "SELECT employee_id_seq.NEXTVAL FROM dual";
	private final String INSERT_NEW_EMPLOYEE = "INSERT INTO employee_details VALUES(?,?,?,?,?,?,?,?)";
	private final String UPDATE_EMPLOYEE = "UPDATE employee_details SET name=?,salary=?,date_of_birth=?,department_id=?,gender=?,state=?,email_id=? WHERE employee_id=?";
	private final String DELETE_EMPLOYEE = "DELETE FROM employee_details WHERE employee_id=?";

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	private List<Employee> employeeList = new ArrayList<>();

	@Override
	public String generateNextEmployeeId() {
		try {
			Class.forName(driver);
			System.out.println("1. Driver loaded");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Successfull");
			preparedStatement = connection.prepareStatement(GENERATE_NEXT_EMPLOYEE_ID);
			System.out.println("3. Query is created");
			resultSet = preparedStatement.executeQuery();
			System.out.println("4. Query executed");

			if (resultSet.next()) {
				String employeeId = "MGS" + resultSet.getInt("NEXTVAL");
				return employeeId;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null && connection != null && preparedStatement != null) {
					resultSet.close();
					connection.close();
					preparedStatement.close();
					resultSet = null;
					connection = null;
					preparedStatement = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Employee addNewEmployee(Employee employee) {
		String employeeId = generateNextEmployeeId();

		try {
			Class.forName(driver);
			System.out.println("1. Driver loaded");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Successfull");
			preparedStatement = connection.prepareStatement(INSERT_NEW_EMPLOYEE);

			preparedStatement.setString(1, employeeId);
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDouble(3, employee.getSalary());

			preparedStatement.setDate(4, Date.valueOf(employee.getDateOfBirth()));
			preparedStatement.setString(5, employee.getDepartment().getDepartmentId());
			preparedStatement.setString(6, employee.getGender());
			preparedStatement.setString(7, employee.getState());
			preparedStatement.setString(8, employee.getEmailId());

			System.out.println("3. Query is created");
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("4. Query executed");
			if (rowCount > 0) {
				employee.setEmployeeId(employeeId);
				return employee;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null && connection != null && preparedStatement != null) {
					resultSet.close();
					connection.close();
					preparedStatement.close();
					resultSet = null;
					connection = null;
					preparedStatement = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		try {
			Class.forName(driver);
			System.out.println("1. Driver loaded");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Successfull");
			preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEES);
			System.out.println("3. Query is created");
			resultSet = preparedStatement.executeQuery();
			System.out.println("4. Query executed");

			while (resultSet.next()) {
				String employeeId = resultSet.getString("employee_id");
				String name = resultSet.getString("name");
				double salary = resultSet.getDouble("salary");
				LocalDate dateOfBirth = resultSet.getDate("date_of_birth").toLocalDate();
				String departmentId = resultSet.getString("department_id");

				Department department = new Department();
				department.setDepartmentId(departmentId);

				String gender = resultSet.getString("gender");
				String state = resultSet.getString("state");
				String emailId = resultSet.getString("email_id");

				Employee employee = new Employee(employeeId, name, salary, dateOfBirth, department, gender, state,
						emailId);
				employeeList.add(employee);

			}
			System.out.println("5. Employees added into list");
			return employeeList;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null && connection != null && preparedStatement != null) {
					resultSet.close();
					connection.close();
					preparedStatement.close();
					resultSet = null;
					connection = null;
					preparedStatement = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Employee getEmployeeByEmployeeId(String employeeId) {
		try {
			Class.forName(driver);
			System.out.println("1. Driver loaded");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Successfull");
			preparedStatement = connection.prepareStatement(SELECT_ONE_EMPLOYEES);
			preparedStatement.setString(1, employeeId);
			System.out.println("3. Query is created");
			resultSet = preparedStatement.executeQuery();
			System.out.println("4. Query executed");

			if (resultSet.next()) {
				String existingEmployeeId = resultSet.getString("employee_id");
				String name = resultSet.getString("name");
				double salary = resultSet.getDouble("salary");
				LocalDate dateOfBirth = resultSet.getDate("date_of_birth").toLocalDate();
				String departmentId = resultSet.getString("department_id");

				Department department = new Department();
				department.setDepartmentId(departmentId);

				String gender = resultSet.getString("gender");
				String state = resultSet.getString("state");
				String emailId = resultSet.getString("email_id");

				Employee employee = new Employee(existingEmployeeId, name, salary, dateOfBirth, department, gender,
						state, emailId);
				return employee;

			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null && connection != null && preparedStatement != null) {
					resultSet.close();
					connection.close();
					preparedStatement.close();
					resultSet = null;
					connection = null;
					preparedStatement = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		try {
			Class.forName(driver);
			System.out.println("1. Driver loaded");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Successfull");
			preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);

			preparedStatement.setString(1, employee.getName());
			preparedStatement.setDouble(2, employee.getSalary());

			preparedStatement.setDate(3, Date.valueOf(employee.getDateOfBirth()));
			preparedStatement.setString(4, employee.getDepartment().getDepartmentId());
			preparedStatement.setString(5, employee.getGender());
			preparedStatement.setString(6, employee.getState());
			preparedStatement.setString(7, employee.getEmailId());
			preparedStatement.setString(8, employee.getEmployeeId());

			System.out.println("3. Query is created");
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("4. Query executed");
			if (rowCount > 0) {
				return employee;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null && connection != null && preparedStatement != null) {
					resultSet.close();
					connection.close();
					preparedStatement.close();
					resultSet = null;
					connection = null;
					preparedStatement = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public boolean removeEmployeeByEmployeeId(String employeeId) {
		try {
			Class.forName(driver);
			System.out.println("1. Driver loaded");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Successfull");
			preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);

			preparedStatement.setString(1, employeeId);
			System.out.println("3. Query is created");
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("4. Query executed");
			if (rowCount > 0) {
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null && connection != null && preparedStatement != null) {
					resultSet.close();
					connection.close();
					preparedStatement.close();
					resultSet = null;
					connection = null;
					preparedStatement = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
