package com.js.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.stereotype.Repository;


@Repository("empDao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMP_NAME_BY_NO="SELECT ENAME FROM EMP WHERE ENO=?";
	
	private DataSource ds;
	private EmpNameByNo ename;
	
	
	@Autowired
	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl()");
		ename = new EmpNameByNo(ds, GET_EMP_NAME_BY_NO);
	}

	@Override
	public String getEmpNameByNo(int eno) {
		System.out.println("EmployeeDAOImpl.getEmpNameByNo()");
		return ename.findObject(eno);
	}

	// Inner Class
	private static class EmpNameByNo extends MappingSqlQuery<String> {
		

		public EmpNameByNo(DataSource ds, String sql) {
			super(ds, sql); // Invokes Super class Constructor
			System.out.println("EmployeeDAOImpl.EmpNameByNo.EmpNameByNo()");
			super.declareParameter(new SqlParameter(Types.INTEGER)); // Declare Parameter for the Super Class Method (TYPE.INTEGER => parameter type)
			super.compile();//prepares the statement which can be executed later.
			
		}
		@Override
		public String mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("EmployeeDAOImpl.EmpNameByNo.mapRow()");
			return rs.getString(1);
		}
		
	}

	
}
