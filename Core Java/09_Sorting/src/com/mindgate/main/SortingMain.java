package com.mindgate.main;

import java.util.Arrays;
import java.util.Comparator;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.util.SortEmployeeByName;
import com.mindgate.main.util.SortEmployeeBySalary;

public class SortingMain {

	public static void main(String[] args) {
		String[] names = { "Bala", "Manikandan", "Abhinash", "Kavithalaya", "Mithra", "Sobiya" };

		Arrays.sort(names);

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("-".repeat(80));

		Employee employee1 = new Employee(104, "Manikandan", 90090);
		Employee employee2 = new Employee(101, "Bala", 90000);
		Employee employee3 = new Employee(103, "Abhinash", 90300);
		Employee employee4 = new Employee(105, "Kavithalaya", 90200);
		Employee employee5 = new Employee(102, "Mithra", 80900);

		Employee[] employees = { employee1, employee2, employee3, employee4, employee5 , employee1 ,employee2 };

//		System.out.println("Sort employee by employeeId(default)");

//
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
//		System.out.println("-".repeat(80));
//
//		System.out.println("Sort employee by name");
//
//		// SortEmployeeByName byName = new SortEmployeeByName();
//		Comparator<Employee> byName = new SortEmployeeByName();
//		Arrays.sort(employees, byName);
//
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}

		System.out.println("-".repeat(80));
		System.out.println("Sort employee by salary");

		Arrays.sort(employees, new SortEmployeeBySalary());

		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
