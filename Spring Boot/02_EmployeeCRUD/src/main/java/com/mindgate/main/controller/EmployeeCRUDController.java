package com.mindgate.main.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.dto.EmployeeDTO;
import com.mindgate.main.dto.ResponseDTO;
import com.mindgate.main.service.EmployeeService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@CrossOrigin("http://localhost:4200")
@Validated
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("employeecrudapi")
public class EmployeeCRUDController {
	private EmployeeService employeeService;

	@GetMapping("employees")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployees());
	}

	@GetMapping("employees/{employeeId}")
	public ResponseEntity<EmployeeDTO> getEmployeeByEmployeeId(@PathVariable("employeeId") String employeeId) {
		log.info(employeeId);
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeByEmployeeId(employeeId));

	}

	@DeleteMapping("employees/{employeeId}")
	public ResponseEntity<ResponseDTO> deleteEmployeeByEmployeeId(@PathVariable("employeeId") String employeeId) {
		boolean status = employeeService.deleteEmployeeByEmployeeId(employeeId);
		if (status) {
			ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK, "Employee deleted successfully");
			return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
		} else {
			ResponseDTO responseDTO = new ResponseDTO(HttpStatus.BAD_REQUEST, "Faild to delete employee");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseDTO);
		}
	}

	@PostMapping("employees/employee")
	public ResponseEntity<ResponseDTO> addNewEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
		employeeDTO = employeeService.addNewEmployee(employeeDTO);
		ResponseDTO responseDTO = new ResponseDTO(HttpStatus.CREATED,
				"New employee added with employeeId :: " + employeeDTO.getEmployeeId());
		return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);

	}

	@PutMapping("employees/employee")
	public ResponseEntity<ResponseDTO> updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
		employeeDTO = employeeService.updateEmployee(employeeDTO);
		ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK, "Employee updated successfully");
		return ResponseEntity.status(HttpStatus.OK).body(responseDTO);

	}
}
