package com.mindgate.main.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.dto.DepartmentDTO;
import com.mindgate.main.repository.DepartmentRepository;
import com.mindgate.main.repository.rowmapper.DepartmentRowMapper;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {

	private JdbcTemplate jdbcTemplate;

	private static final String SELECT_ALL_DEPARTMENTS = "SELECT * FROM department_details";

	public DepartmentRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<DepartmentDTO> getAllDepartments() {
		return jdbcTemplate.query(SELECT_ALL_DEPARTMENTS, new DepartmentRowMapper());
	}

}
