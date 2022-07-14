package com.js.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.js.model.Employee;

@Repository("empDao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	private SimpleJdbcInsert sji;

	/*
	@Override
	// Map Object
	public int insertEmployee(Employee emp) {
		sji.setTableName("emp");
		Map<String,Object> map = Map.of("ENO",emp.getEno(),
				"ENAME",emp.getEname(),
				"JOB",emp.getJob(),
				"SALARY",emp.getSalary(),
				"DEPTNO",emp.getDeptno());
		
		return sji.execute(map);
	}
	
	// MapSqlParamSource
	@Override
	public int insertEmployee(Employee emp) {
		sji.setTableName("emp");
		
		MapSqlParameterSource source = new  MapSqlParameterSource();
		source.addValue("ENO", emp.getEno());
		source.addValue("ENAME", emp.getEname());
		source.addValue("Job", emp.getJob());
		source.addValue("SALARY", emp.getSalary());
		source.addValue("DEPTNO", emp.getDeptno());
		
		return sji.execute(source);
	}
	*/
	
	// BeanPropertySqlParam
		@Override
		public int insertEmployee(Employee emp) {
			sji.setTableName("emp");
			
			BeanPropertySqlParameterSource source = new BeanPropertySqlParameterSource(emp);
			
			return sji.execute(source);
		}
}
