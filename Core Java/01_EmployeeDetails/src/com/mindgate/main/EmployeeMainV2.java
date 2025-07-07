package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.main.domain.Employee;

public class EmployeeMainV2 {

	public static void main(String[] args) {
		System.out.println("main start");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter employeeId");
		int employeeId = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter name");
		// String name = scanner.next();
		String name = scanner.nextLine();

		System.out.println("Enter salary");
		double salary = scanner.nextDouble();

//		Employee employee = new Employee();
//		employee.setEmployeeId(employeeId);
//		employee.setName(name);
//		employee.setSalary(salary);
		Employee employee = new Employee(employeeId, name, salary);

		double ctc = employee.calculateSalary(12000, 100000);
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
		System.out.println("Cost to company = " + ctc);

		scanner.close();
		System.out.println("main end");

	}

}
