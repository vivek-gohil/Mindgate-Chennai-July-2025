package com.mindgate.main.domain;

import java.time.LocalDate;

/**
 * @author MGS5237
 *
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private String employeeId;
	private String name;
	private double salary;
	private LocalDate dateOfBirth;
	private String departmentId;
	private String gender;
	private String state;
	private String emailId;

	

}
