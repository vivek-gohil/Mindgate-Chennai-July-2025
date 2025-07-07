package com.mindgate.main;

import com.mindgate.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		// employee.employeeId = 101;
		employee.setEmployeeId(101);
		employee.setName("Mohan");
		employee.setSalary(90000);
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		System.out.println("-----------------------");

		Employee employee2 = new Employee();
		employee2.setEmployeeId(102);
		employee2.setName("Bala");
		employee2.setSalary(90000);
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee2.getName());
		System.out.println(employee2.getSalary());
	}

}
