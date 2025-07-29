package com.mindgate.main;

import com.mindgate.main.builder.EmployeeBuilder;
import com.mindgate.main.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new EmployeeBuilder().setSalary(1000).build();
		
		Employee employee2 = new EmployeeBuilder().setName("Mindgate").build();
		
		Employee employee3 = new EmployeeBuilder().setName("Mindgate").setSalary(1001).build();
		
		Employee employee4 = new EmployeeBuilder().build();
		
		Employee employee5 = new EmployeeBuilder().setName("Bala").setCity("Chennai").build();

		System.out.println(employee5);
	}
}
