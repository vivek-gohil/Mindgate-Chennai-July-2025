package com.mindgate.main.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindgate.main.dto.DepartmentDTO;
import com.mindgate.main.repository.DepartmentRepository;
import com.mindgate.main.service.DepartmentService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository departmentRepository;

	@Override
	public List<DepartmentDTO> getAllDepartments() {
		return departmentRepository.getAllDepartments();
	}

}
