package com.js.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.js.entity.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO{
	
	public static final String GET_EMPLOYEES_BY_DESGS=
			"SELECT ENO,ENAME,JOB,SALARY,DEPTNO FROM EMP WHERE JOB IN(?,?,?)";
	
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		
		List<Employee> list = null;
		try (Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMPLOYEES_BY_DESGS);
				) {
			ps.setString(1,desg1); ps.setString(2, desg2); ps.setString(3, desg3);
			
			try(ResultSet rs = ps.executeQuery()){
				list = new ArrayList();
				
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					list.add(emp);
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
			
		return list;
	}

}
