package com.mindgate.main.util;

import java.util.Comparator;

import com.mindgate.main.domain.Employee;

public class SortEmployeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		return employee1.getName().compareTo(employee2.getName());
	}

}
