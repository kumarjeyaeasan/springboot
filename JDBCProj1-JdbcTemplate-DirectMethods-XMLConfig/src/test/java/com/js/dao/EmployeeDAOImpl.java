package com.js.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
	
	private JdbcTemplate jt;
	
	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt=jt;
	}

	@Override
	public int getEmpCount() {
		return jt.queryForObject(GET_EMP_COUNT, Integer.class);
	}

}
