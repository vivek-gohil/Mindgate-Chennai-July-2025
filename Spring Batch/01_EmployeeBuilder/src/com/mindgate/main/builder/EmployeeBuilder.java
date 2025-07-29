package com.mindgate.main.builder;

import com.mindgate.main.domain.Address;
import com.mindgate.main.domain.Employee;

public class EmployeeBuilder {
	private Employee employee;
	private Address address;

	public EmployeeBuilder() {
		employee = Employee.getEmployee();
		address = Address.getAddress();
		employee.setAddress(address);
	}

	public Employee build() {
		return employee;
	}

	public EmployeeBuilder setAddressId(int addressId) {
		employee.getAddress().setAddressId(addressId);
		return this;
	}

	public EmployeeBuilder setBlock(String block) {
		employee.getAddress().setBlock(block);
		return this;
	}

	public EmployeeBuilder setStreet(String street) {
		employee.getAddress().setSteet(street);
		return this;
	}

	public EmployeeBuilder setCity(String city) {
		employee.getAddress().setCity(city);
		return this;
	}

	public EmployeeBuilder setState(String state) {
		employee.getAddress().setState(state);
		return this;
	}

	public EmployeeBuilder setEmployeeId(int employeeId) {
		employee.setEmployeeId(employeeId);
		return this;
	}

	public EmployeeBuilder setName(String name) {
		employee.setName(name);
		return this;
	}

	public EmployeeBuilder setSalary(double salary) {
		employee.setSalary(salary);
		return this;
	}

}
