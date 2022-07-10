package com.js.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_NAME="SELECT ENAME FROM EMP WHERE ENO=?";
	private static final String GET_EMP_DETAILS = "SELECT * FROM EMP WHERE ENO=?";
	private static final String GET_ALL_EMP = "SELECT * FROM EMP";
	private static final String DEL_EMP_BY_DEPTNO = "DELETE FROM EMP WHERE DEPTNO=?";
	private static final String UPD_EMP_BY_DEPTNO = "UPDATE EMP SET SALARY=12000 WHERE DEPTNO=?";
	private static final String INS_EMP="INSERT INTO EMP(ENO,ENAME,JOB,SALARY,DEPTNO) VALUES(?,?,?,?,?)";
	
	@Autowired
	private JdbcTemplate jt;
	

	@Override
	public int getEmpCount() {
		return jt.queryForObject(GET_EMP_COUNT, Integer.class);
	}

	@Override
	public String getEmpNameByEno(int eno) {
		
		return jt.queryForObject(GET_EMP_NAME, String.class,eno);
		
	}

	@Override
	public Map<String, Object> getOneEmpRecord(int eno) {
		return jt.queryForMap(GET_EMP_DETAILS,eno);
	}

	@Override
	public List<Map<String, Object>> getAllEmp() {
		return jt.queryForList(GET_ALL_EMP);
	}

	@Override
	public int delEmpByDeptId(int deptno) {
		return jt.update(DEL_EMP_BY_DEPTNO,deptno);
	}

	@Override
	public int updEmpSalByDeptId(int deptno) {
		// TODO Auto-generated method stub
		return jt.update(UPD_EMP_BY_DEPTNO,deptno);
	}

	@Override
	public int insNewEmp(int eno, String ename, String job, float sal, String depno) {
		// TODO Auto-generated method stub
		return jt.update(INS_EMP,eno,ename,job,sal,depno);
	}

}
