package com.mindgate.main.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
	private String employeeId;
	
	@NotBlank(message = "Name is required")
	@Size(min = 2, max = 50, message = "Name must be between 2 & 50 char")
	private String name;
	
	@Positive(message = "Salary must be a positive number")
	private double salary;
	
	@Past(message = "Date of birth must be in past")
	private LocalDate dateOfBirth;
	
	@NotNull(message = "Department is required")
	private DepartmentDTO departmentDTO;
	
	@NotBlank(message = "Gender is required")
	@Pattern(regexp = "Male|Female|Other", message = "Gender must be Male, Female, Other")
	private String gender;
	
	@NotBlank(message = "State is required")
	private String state;
	
	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	private String emailId;

}
