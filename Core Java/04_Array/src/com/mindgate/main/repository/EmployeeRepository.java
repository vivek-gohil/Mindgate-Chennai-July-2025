package com.mindgate.main.repository;

import com.mindgate.main.domain.Employee;

public class EmployeeRepository {

	private Employee[] employees = new Employee[5];

	public EmployeeRepository() {

		employees[0] = new Employee(101, "Srivishwa", 90000);
		employees[1] = new Employee(102, "Selva", 90000);
		employees[2] = new Employee(103, "Sadhan", 90000);
		employees[3] = new Employee(104, "Senoj", 90000);
		employees[4] = new Employee(105, "Aridaman", 90000);
	}

	public Employee updateEmployeeSalaryByEmployeeId(int employeeId, double newSalary) {
		Employee existingEmployee = getEmployeeByEmployeeId(employeeId);
		if (existingEmployee != null) {
			existingEmployee.setSalary(newSalary);
			return existingEmployee;
		}
		return null;
	}

	public Employee updateEmployeeNameByEmployeeId(int employeeId, String newName) {
		return null;
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == employeeId)
				return employee;
		}
		return null;
	}
}
