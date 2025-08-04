package com.mindgate.main.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.dto.DepartmentDTO;
import com.mindgate.main.service.DepartmentService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin("http://localhost:4200")
@AllArgsConstructor
@RestController
@Slf4j
@RequestMapping("departmentapi")
public class DepartmentController {

	private DepartmentService departmentService;

	@GetMapping("departments")
	public ResponseEntity<List<DepartmentDTO>> getAllDepartments() {
		return ResponseEntity.status(HttpStatus.OK).body(departmentService.getAllDepartments());
	}

}




