package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Employee;

public class ArrayMain {

	public static void main(String[] args) {
		int[] data = new int[5];

		data[0] = 23;
		data[1] = 412;
		data[2] = 23;
		data[3] = -123;
		data[4] = 0;

		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
		System.out.println(data[4]);

		System.out.println();

		String[] names = { "Bala", "Ajay", "Devak", "Himanshu", "Astik" };

		System.out.println("Printing using for loop");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println();
		System.out.println("Printing using for each loop");
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println();

		Employee employee1 = new Employee(101, "Srivishwa", 90000);
		Employee employee2 = new Employee(102, "Selva", 90000);
		Employee employee3 = new Employee(103, "Sadhan", 90000);
		Employee employee4 = new Employee(104, "Senoj", 90000);
		Employee employee5 = new Employee(105, "Aridaman", 90000);

		Employee[] employees = { employee1, employee2, employee3, employee4, employee5 };

		for (Employee employee : employees) {
			System.out.println(employee);
		}

		Scanner scanner = new Scanner(System.in);
		int employeeId;
		Employee employee = null;
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
			employee = getEmployeeByEmployeeId(employeeId, employees);
			if (employee != null) {
				System.out.println("Employee Found");
				System.out.println(employee);
			} else
				System.out.println("Invalid EmployeeId");
			break;
		case 2:
			System.out.println("Enter employeeId");
			employeeId = scanner.nextInt();
			employee = getEmployeeByEmployeeId(employeeId, employees);
			if (employee != null) {
				System.out.println("Employee Found");
				System.out.println(employee);
				System.out.println("Enter New Name");
				scanner.nextLine();
				String name = scanner.nextLine();
				employee.setName(name);
				System.out.println("Updated Employee");
				System.out.println(employee);
			} else
				System.out.println("Invalid EmployeeId");

			break;
		case 3:
			System.out.println("Enter employeeId");
			employeeId = scanner.nextInt();
			employee = getEmployeeByEmployeeId(employeeId, employees);
			if (employee != null) {
				System.out.println("Employee Found");
				System.out.println(employee);
				System.out.println("Enter New Salary");

				double salary = scanner.nextDouble();
				employee.setSalary(salary);
				System.out.println("Updated Employee");
				System.out.println(employee);
			} else
				System.out.println("Invalid EmployeeId");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

	public static Employee getEmployeeByEmployeeId(int employeeId, Employee[] employees) {
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

}
