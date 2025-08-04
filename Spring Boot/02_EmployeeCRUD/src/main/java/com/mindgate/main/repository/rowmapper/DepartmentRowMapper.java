package com.mindgate.main.repository.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.dto.DepartmentDTO;

public class DepartmentRowMapper implements RowMapper<DepartmentDTO> {
	@Override
	public DepartmentDTO mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		return new DepartmentDTO(resultSet.getString("department_id"), resultSet.getString("department_name"));
	}
}
