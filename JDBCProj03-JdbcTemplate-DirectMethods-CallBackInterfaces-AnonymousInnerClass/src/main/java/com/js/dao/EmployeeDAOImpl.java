package com.js.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.js.model.Employee;

@Repository("empDao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_BY_ID="SELECT ENO,ENAME,JOB,SALARY,DEPTNO FROM EMP WHERE ENO=?";
	private static final String GET_EMP_BY_DEPT="SELECT ENO,ENAME,JOB,SALARY,DEPTNO FROM EMP WHERE DEPTNO=?";
	@Autowired
	private JdbcTemplate jt;
	
	
	
	
	@Override
	public List<Employee> getEmpByDept(int deptno) {
		return jt.query(GET_EMP_BY_DEPT, rs->{
			List<Employee> list = new ArrayList<Employee>();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getFloat(4));
				emp.setDepno(rs.getInt(5));
				list.add(emp);
			}
			return list;
		},deptno);
	}
	
	/*
	@Override
	public Employee getEmpDetailsById(int eno) {
		return jt.queryForObject(GET_EMP_BY_ID, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getFloat(4));
				emp.setDepno(rs.getInt(5));
				return emp;
			}},eno);
	}*/
	
	@Override
	public Employee getEmpDetailsById(int eno) {
		return jt.queryForObject(GET_EMP_BY_ID, (rs,rowNum)-> {

				Employee emp = new Employee();
				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getFloat(4));
				emp.setDepno(rs.getInt(5));
				return emp;
			},eno);
	}

	/*
	// Inner Class
	private class EmployeeMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setEno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSal(rs.getFloat(4));
			emp.setDepno(rs.getInt(5));
			return emp;
		}
		
	}
	*/
}
