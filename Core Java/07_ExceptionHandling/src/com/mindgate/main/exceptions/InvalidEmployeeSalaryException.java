package com.mindgate.main.exceptions;

public class InvalidEmployeeSalaryException extends Exception {
	@Override
	public String getMessage() {
		return "Salary must be > 10000";
	}
}
