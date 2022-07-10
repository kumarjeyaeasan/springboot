package com.js.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_NAME="SELECT ENAME FROM EMP WHERE ENO=?";
	
	private JdbcTemplate jt;
	
	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt=jt;
	}

	@Override
	public int getEmpCount() {
		return jt.queryForObject(GET_EMP_COUNT, Integer.class);
	}

	@Override
	public String getEmpNameByEno(int eno) {
		
		return jt.queryForObject(GET_EMP_NAME, String.class,eno);
		
	}

}
