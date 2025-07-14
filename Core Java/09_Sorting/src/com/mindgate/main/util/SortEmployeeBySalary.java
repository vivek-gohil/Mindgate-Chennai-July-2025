package com.mindgate.main.util;

import java.util.Comparator;

import com.mindgate.main.domain.Employee;

public class SortEmployeeBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee employee1, Employee employee2) {

		return (int) (employee1.getSalary() - employee2.getSalary());
	}
}
