package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.main.repository.EmployeeRepository;
import com.mindgate.main.service.EmployeeService;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("main() start");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mindgate.main");

		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		System.out.println("employeeService = " + employeeService.hashCode());
		System.out.println("employeeRepository = " + employeeService.getEmployeeRepository().hashCode());

		employeeService.doGreet();

		System.out.println();

		EmployeeService employeeService2 = applicationContext.getBean("employeeService", EmployeeService.class);
		System.out.println("employeeService = " + employeeService2.hashCode());
		System.out.println("employeeRepository = " + employeeService2.getEmployeeRepository().hashCode());

		employeeService2.doGreet();

		System.out.println("main() end");
	}
}
