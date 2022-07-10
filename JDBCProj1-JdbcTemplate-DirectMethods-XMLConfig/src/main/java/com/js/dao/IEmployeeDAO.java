package com.js.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDAO {

	public int getEmpCount();
	public String getEmpNameByEno(int eno);
	public Map<String,Object> getOneEmpRecord(int eno);
	public List<Map<String,Object>> getAllEmp();
	public int delEmpByDeptId(int deptno);
	public int updEmpSalByDeptId(int deptno);
	public int insNewEmp(int eno,String ename, String job, float sal, String depno);
}
