package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Scanner scanner = new Scanner(System.in);

		int employeeId;

		System.out.println("Menu");
		System.out.println("1. Search Employee By EmployeeId");
		System.out.println("2. Update Employee Name By EmployeeId");
		System.out.println("3. Update Employee Salary By EmployeeId");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter employeeId");
			employeeId = scanner.nextInt();

			Employee employee = employeeService.searchEmployeeByEmployeeId(employeeId);
			if (employee != null) {
				System.out.println("Employee Found");
				System.out.println(employee);
			} else
				System.out.println("Invalid EmployeeId");
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
