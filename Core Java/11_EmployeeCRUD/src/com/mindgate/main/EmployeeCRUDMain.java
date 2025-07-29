package com.mindgate.main;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.mindgate.main.domain.Department;
import com.mindgate.main.domain.Employee;
import com.mindgate.main.repository.EmployeeRepository;
import com.mindgate.main.repository.EmployeeRepositoryImpl;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

		Scanner scannner = new Scanner(System.in);
		System.out.println("Enter employeeId");
		String employeeId = scannner.next();
		
		
		
		
//		System.out.println("Enter employeeId");
//		String employeeId = scannner.next();
//		scannner.nextLine();
//		System.out.println("Details To Be Updated");
//		System.out.println("Enter Name");
//		String name = scannner.nextLine();
//
//		System.out.println("Enter Salary");
//		double salary = scannner.nextDouble();
//
//		System.out.println("Enter day of date of birth");
//		int day = scannner.nextInt();
//		System.out.println("Enter month of date of birth");
//		int month = scannner.nextInt();
//		System.out.println("Enter year of date of birth");
//		int year = scannner.nextInt();
//		LocalDate dateOfBirth = LocalDate.of(year, month, day);
//
//		System.out.println("Enter DepartmentId");
//		String departentId = scannner.next();
//
//		System.out.println("Enter gender");
//		String gender = scannner.next();
//		scannner.nextLine();
//		System.out.println("Enter state");
//		String state = scannner.nextLine();
//
//		System.out.println("Enter email");
//		String email = scannner.next();
//
//		Department department = new Department();
//		department.setDepartmentId(departentId);
//
//		Employee employee = new Employee(employeeId, name, salary, dateOfBirth, department, gender, state, email);
//		employee = employeeRepository.updateEmployee(employee);
//		System.out.println(employee);

//		Employee employee = employeeRepository.getEmployeeByEmployeeId(employeeId);
//		if (employee != null) {
//			System.out.println(employee);
//		} else {
//			System.out.println("Invalid EmployeeId");
//		}
		System.out.println("-".repeat(80));

		// Select All
		List<Employee> allEmployees = employeeRepository.getAllEmployees();
		for (Employee e : allEmployees) {
			System.out.println(e);
		}

	}

}
