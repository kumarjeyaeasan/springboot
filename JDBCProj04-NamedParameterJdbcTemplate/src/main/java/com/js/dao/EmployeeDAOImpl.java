package com.js.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.js.model.Employee;

@Repository("empDao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_NAME_BY_ID="SELECT ENAME FROM EMP WHERE ENO=:eno";
	private static final String GET_EMP_BY_DEPT="SELECT ENO,ENAME,JOB,SALARY,DEPTNO FROM EMP WHERE DEPTNO=:deptno";
	private static final String INSERT_EMPLOYEE="INSERT INTO EMP(ENO,ENAME,JOB,SALARY,DEPTNO) VALUES(:eno,:ename,:job,:sal,:depno)";
	
	
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	
	// Map Object
	@Override
	public String getEmpNameByNo(int eno) {
		return npjt.queryForObject(GET_EMP_NAME_BY_ID, Map.of("eno",eno), String.class);
	}

	// MapSqlParameterSource
	@Override
	public List<Employee> getEmpByDept(int deptno) {
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("deptno", deptno);		
		List<Employee> list = new ArrayList();
		return npjt.query(GET_EMP_BY_DEPT, source, rs->{
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getFloat(4));
				emp.setDepno(rs.getInt(5));
				list.add(emp);
			}
			return list;
		});
	}

	// BeanPropertySQLParameterSource
	@Override
	public int inserEmployee(Employee emp) {
	
		return npjt.update(INSERT_EMPLOYEE, new BeanPropertySqlParameterSource(emp));
	}
	
	
	
}
