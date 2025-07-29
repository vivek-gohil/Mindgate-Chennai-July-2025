package com.mindgate.main;

import com.mindgate.main.repository.EmployeeRepository;
import com.mindgate.main.service.EmployeeService;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("main() start");

		// EmployeeRepository employeeRepository = new EmployeeRepository();
		EmployeeService employeeService = new EmployeeService(new EmployeeRepository());
		employeeService.doGreet();

		System.out.println("main() end");
	}
}
