package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.main.repository.EmployeeRepository;
import com.mindgate.main.service.EmployeeService;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("main() start");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mindgate.main");

		EmployeeRepository employeeRepository = applicationContext.getBean("employeeRepository",
				EmployeeRepository.class);

		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		employeeService.setEmployeeRepository(employeeRepository);

		employeeService.doGreet();

		System.out.println("main() end");
	}
}
