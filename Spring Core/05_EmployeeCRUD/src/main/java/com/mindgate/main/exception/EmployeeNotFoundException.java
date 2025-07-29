package com.mindgate.main.exception;

public class EmployeeNotFoundException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Employee Not Found!!";
	}
}
