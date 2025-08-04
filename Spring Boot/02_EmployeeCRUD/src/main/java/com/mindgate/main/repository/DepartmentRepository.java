package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.dto.DepartmentDTO;

public interface DepartmentRepository {
	List<DepartmentDTO> getAllDepartments();
}
