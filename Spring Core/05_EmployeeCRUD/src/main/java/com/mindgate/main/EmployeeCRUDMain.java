package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.main.configuration.SpringConfiguration;
import com.mindgate.main.domain.Employee;
import com.mindgate.main.service.EmployeeService;
import com.mindgate.main.service.EmployeeServiceImpl;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		EmployeeService employeeService = applicationContext.getBean(EmployeeServiceImpl.class);
		Scanner scannner = new Scanner(System.in);
		System.out.println("Enter employeeId");
		String employeeId = scannner.next();
		Employee employee = employeeService.getEmployeeByEmployeeId(employeeId);
		if (employee != null) {
			System.out.println(employee);
		} else {
		System.out.println("Invalid EmployeeId");
		}

//		List<Employee> employeeList = employeeService.getAllEmployees();
//
//		for (Employee employee : employeeList) {
//			System.out.println(employee);
//		}
	}
}
